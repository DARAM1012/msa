function createDiv(width, height) {
  var div = document.createElement('div');
  div.style.position = 'absolute';
  div.style.width = width + 'px';
  div.style.height = height + 'px';
  return div;
}

var colour = "random"; // Use "random" or any valid color e.g. "#f0f" or "red"
var sparkles = 50;

var x = ox = 400;
var y = oy = 300;
var swide, shigh;
var sleft, sdown;
var tiny = [];
var star = [];
var starv = [];
var starx = [];
var stary = [];
var tinyx = [];
var tinyy = [];
var tinyv = [];

window.onload = function() {
  for (var i = 0; i < sparkles; i++) {
      var tinyDiv = createDiv(3, 3);
      tinyDiv.style.visibility = "hidden";
      tinyDiv.style.zIndex = "999";
      document.body.appendChild(tiny[i] = tinyDiv);
      starv[i] = 0;
      tinyv[i] = 0;

      var starDiv = createDiv(5, 5);
      starDiv.style.backgroundColor = "transparent";
      starDiv.style.visibility = "hidden";
      starDiv.style.zIndex = "999";

      var leftDiv = createDiv(1, 5);
      var downDiv = createDiv(5, 1);
      starDiv.appendChild(leftDiv);
      starDiv.appendChild(downDiv);
      leftDiv.style.top = "2px";
      leftDiv.style.left = "0px";
      downDiv.style.top = "0px";
      downDiv.style.left = "2px";

      document.body.appendChild(star[i] = starDiv);
  }
  updateDimensions();
  sparkle();
};

function updateDimensions() {
  swide = document.documentElement.clientWidth + document.documentElement.scrollLeft;
  shigh = document.documentElement.clientHeight + document.documentElement.scrollTop;
  sleft = document.documentElement.scrollLeft;
  sdown = document.documentElement.scrollTop;
}

function sparkle() {
  if (Math.abs(x - ox) > 1 || Math.abs(y - oy) > 1) {
      ox = x;
      oy = y;
      for (var c = 0; c < sparkles; c++) {
          if (!starv[c]) {
              star[c].style.left = (starx[c] = x - sleft) + "px";
              star[c].style.top = (stary[c] = y - sdown + 1) + "px";
              star[c].style.clip = "rect(0px, 5px, 5px, 0px)";
              star[c].childNodes[0].style.backgroundColor = star[c].childNodes[1].style.backgroundColor = (colour == "random") ? newColour() : colour;
              star[c].style.visibility = "visible";
              starv[c] = 50;
              break;
          }
      }
  }
  for (var c = 0; c < sparkles; c++) {
      if (starv[c]) update_star(c);
      if (tinyv[c]) update_tiny(c);
  }
  requestAnimationFrame(sparkle);
}

function update_star(i) {
  if (--starv[i] == 25) star[i].style.clip = "rect(1px, 4px, 4px, 1px)";
  if (starv[i]) {
      stary[i] += 1 + Math.random() * 3;
      starx[i] += (i % 5 - 2) / 5;

      // 화면 범위 제한
      if (stary[i] < shigh && starx[i] >= 0 && starx[i] < swide) {
          star[i].style.top = stary[i] + "px";
          star[i].style.left = starx[i] + "px";
      } else {
          star[i].style.visibility = "hidden";
          starv[i] = 0;
          return;
      }
  } else {
      tinyv[i] = 50;
      tiny[i].style.top = (tinyy[i] = stary[i]) + "px";
      tiny[i].style.left = (tinyx[i] = starx[i]) + "px";
      tiny[i].style.width = "2px";
      tiny[i].style.height = "2px";
      tiny[i].style.backgroundColor = star[i].childNodes[0].style.backgroundColor;
      star[i].style.visibility = "hidden";
      tiny[i].style.visibility = "visible";
  }
}

function update_tiny(i) {
  if (--tinyv[i] == 25) {
      tiny[i].style.width = "1px";
      tiny[i].style.height = "1px";
  }
  if (tinyv[i]) {
      tinyy[i] += 1 + Math.random() * 3;
      tinyx[i] += (i % 5 - 2) / 5;

      // 화면 범위 제한
      if (tinyy[i] < shigh && tinyx[i] >= 0 && tinyx[i] < swide) {
          tiny[i].style.top = tinyy[i] + "px";
          tiny[i].style.left = tinyx[i] + "px";
      } else {
          tiny[i].style.visibility = "hidden";
          tinyv[i] = 0;
          return;
      }
  } else {
      tiny[i].style.visibility = "hidden";
  }
}

function newColour() {
  return 'rgb(' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ')';
}

window.onresize = updateDimensions;
window.onscroll = updateDimensions;

// 마우스 움직임 이벤트 리스너 추가
window.addEventListener('mousemove', function(event) {
  x = event.pageX + document.documentElement.scrollLeft;
  y = event.pageY + document.documentElement.scrollTop;
});