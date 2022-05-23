<template>
<div class="background">
  <div class="menu">
  <div class="button" @click="goTarget('https://cn.bing.com/?pc=U528')">
  </div>
  <div class="button"></div>
  <div class="button"></div>
  <div class="button"></div>
  <div class="button"></div>
  <div class="button"></div>
  <div class="button"></div>
  </div>
  <div class="linux_Desket" >
    <iframe class="linux_exe" src="http://192.168.232.128:2222/ssh/host/10.162.148.222:8080" scrolling="auto"></iframe>
  </div>

</div>
</template>

<script>
export default {
  name: "linux_page",
  methods:{
    goTarget(href) {
      window.open(href, "_blank");
    },
  },
};


</script>

<style scoped>

.linux_exe{
  margin-left: 200px;
  resize: both;
  height: 400px;
  width: 600px;
  margin-top: 100px;
}
.menu{
  float: left;
  height: max-content;
  width: 58px;
}
.linux_Desket{
  position: relative;
  resize: both;
  margin-left: 58px;
  width: max-content;
  height: max-content;

}
.button{
  float: left;
  height: 55px;
  width: 58px;
  border-radius: 10px;
}
.button:hover{
  background-color: rgba(100,100,100,0.5);
  -webkit-filter:brightness(0.8);
  -o-filter:brightness(0.8);
  -moz-filter:brightness(0.8);
  filter:brightness(0.8);
}
.background{
    background-size: cover;
  background-image: url("picture/Deskettop.png");
}
</style>