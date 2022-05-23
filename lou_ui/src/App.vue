<template>
<!--  <img alt="Vue logo" src="./assets/logo.png">-->
<!--  <HelloWorld msg="Welcome to Your Vue.js App"/>-->
  <InducePage class="inducePage"></InducePage>
  <LinuxPage class="linuxPage"></LinuxPage>
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'
import InducePage from './components/induce_page.vue'
import LinuxPage from './components/linux_page.vue'
export default {
  name: 'App',
  components: {
    // HelloWorld,
    InducePage,
    LinuxPage
  }
}
</script>

<style>
#app {
  display: flex;
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 0;
}
.inducePage{
width: 100%;
}
.linuxPage{
width: 100%;
}
</style>
