import { cc } from './myclass.js';

// const [a, b, c] = cc;

const mybgclass = ['bg-orange-400', 'bg-green-400', 'bg-yellow-400'];
const removeclass = () => {
  for (const element of mybgclass) {
    document.querySelector('#result').classList.remove(element);
  }
}

document.querySelector('#orange').onclick = () => {
  removeclass();
  document.querySelector('#result').classList.add('bg-orange-400');
}

document.querySelector('#green').onclick = () => {
  removeclass();
  document.querySelector('#result').classList.add('bg-green-400');

}

document.querySelector('#yellow').onclick = () => {
  removeclass();
  document.querySelector('#result').classList.add('bg-yellow-400');

}