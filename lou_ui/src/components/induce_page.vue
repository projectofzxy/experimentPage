<template>
  <div id="left">
      <div>
        <el-container>
          <el-aside width="40%">
            <img v-bind:src="imgUrl" alt="">
          </el-aside>
          <el-main>Linux基础入门</el-main>
        </el-container>
      </div>
      <div>
        <div class="collapse">
          <el-collapse v-for="item in experiments" :key="item.id" v-model="activeName" accordion>
            <el-collapse-item class="active" v-bind:title="'实验'+item.id+' '+item.name" v-bind:name=item.id>
              <div class="page">
                <el-container direction="vertical">
                  <el-header style="font-weight: bold" height="20px"><el-icon><ArrowLeftBold /></el-icon>
                    实验介绍
                    <el-icon><ArrowRightBold /></el-icon></el-header>
                  <el-main class="main">
                    <span style="font-weight: bold">实验要求:</span>
                    <br>
                    {{ item.request }}
                    <br>
                    <span style="font-weight: bold">实验内容：</span>
                    <br>
                    <el-icon><Download /></el-icon>
                    <el-link v-bind:href="'http://localhost:8081/menu/down/'+item.context" type="primary">{{ item.context }}</el-link>
                  </el-main>
                </el-container>

              </div>
            </el-collapse-item>
          </el-collapse>
        </div>
      </div>

  </div>
</template>

<script>

import {ref} from 'vue'

const activeName = ref('1')

import axios from "axios";

export default {

  name: "induce_page",
  data() {
    return {
      imgUrl: require("../assets/Lixux_picture.png"),
      activeName,
      experiments: [{
        id: 1,
        name: 'experiment',
        request: '',
        context: '',
      }]
    }

  },
  created() {
    const _this = this
    axios.get('http://localhost:8081/menu/findAll').then(function (resp) {
      _this.experiments = resp.data
      console.log(resp.data)
    })
  }
}
</script>

<style scoped>
.main {
  white-space: pre-wrap;
  text-align: left;
}


#left {
  width: 800px;
  height: 690px;
}
</style>