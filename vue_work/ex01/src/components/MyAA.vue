<template>
  <div>
    <h1>MyAA = {{name}}</h1>
  </div>
</template>

<script>
export default {
  props:['name'],
  setup () {
 
 return {}   // const name = '홍길동';
    // return {name}
  }
}
</script>

<style lang="scss" scoped>

</style>