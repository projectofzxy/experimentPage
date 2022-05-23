const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  chainWebpack: config =>{
    config.plugin('html')
        .tap(args => {
          args[0].title = "实验楼";
          return args;
        })
  }
  // devServer:{
  //   proxy:{
  //     '/api':{
  //       target:'http://localhost:8081/',
  //       changeOrigin:true,
  //       PathRewrite:{
  //         '^/api':''
  //       }
  //     }
  //   }
  // }
})
