<template>
  <div id="content">
    <page-module v-for="(item, index) in data" class="content-module" :path="'page/' + (index + 1)">
      <div :style="{'background': 'url(' + item.img + ')', 'background-size': 'cover'}" slot="img" class="img">
        <div class="black"></div>
      </div>
      <h2 slot="title" class="title">{{item.title}}</h2>
      <p slot="summary" class="summary">{{item.summary}}</p>
      <p slot="time" class="time">{{item.time}}</p>
    </page-module>
  </div>
</template>

<script>
  import PageModule from "@/components/page/PageModule";
  import data from "@/components/data"

  export default {
    name: "Content",
    components: {PageModule},
    data() {
      return {
        data,
      }
    },
  }
</script>

<style scoped>
  #content {
    width: 50%;
    height: 100%;
    text-align: center;
    overflow: hidden;
    left: 50px;
    position: relative;
    margin: 5em auto;
    user-select: none;
  }

  .img {
    width: 100%;
    height: 100%;
    transition: all 0.2s linear;
  }

  .content-module:hover .img {
    transform: scale(1.1);
    transition: all 0.2s linear;
  }

  .black {
    width: 100%;
    height: 100%;
    background-color: rgba(0, 0, 0, 0);
    transition: all 0.2s linear;
  }

  .content-module:hover .black {
    background-color: rgba(0, 0, 0, 0.5);
    transition: all 0.2s linear;
  }

  .title {
    color: rgba(255, 255, 255, 1);
    margin-top: -240px;
    font-size: 30px;
    text-shadow: 0 0 0.2em #f87,
    -0 -0 0.2em #f87;
    transition: all 0.2s linear;
  }

  .content-module:hover .title {
    color: rgba(255, 255, 255, 0);
    transform: scale(1.2);
    text-shadow: 0 0 0;
    transition: all 0.2s linear;
  }

  .summary {
    color: rgba(255, 255, 255, 0);
    margin-top: -260px;
    transform: scale(1.5);
    transition: all 0.2s linear;
  }

  .time {
    color: rgba(255, 255, 255, 0);
    margin-top: -120px;
    transform: scale(1.5);
    transition: all 0.2s linear;
  }

  .content-module:hover p {
    color: rgba(255, 255, 255, 1);
    transform: scale(1);
    transition: all 0.2s linear;
  }

  @media screen and (max-width: 600px) {
    #content {
      width: 60%;
      height: 100%;
      text-align: left;
      overflow: hidden;
      left: 0;
      position: relative;
      margin: 3em auto;
    }

    .img {
      width: 100%;
      height: 70%;
      margin-top: -20px;
      transition: all 0.2s linear;
    }

    .content-module:hover .img {
      transform: scale(1);
      transition: all 0.2s linear;
    }

    .black {
      width: 100%;
      height: 100%;
      background-color: rgba(0, 0, 0, 0);
      transition: all 0.2s linear;
    }

    .content-module:hover .black {
      background-color: rgba(0, 0, 0, 0);
      transition: all 0.2s linear;
    }

    .title {
      color: #07031a;
      width: 100%;
      text-align: left;
      margin-top: 110px;
      margin-left: 10px;
      font-size: 15px;
      text-shadow: 0 0 0;
      transition: all 0.2s linear;
    }

    .content-module:hover .title {
      color: #07031a;
      transform: scale(1);
      transition: all 0.2s linear;
    }

    .summary {
      margin-top: .8em;
      margin-left: 10px;
      color: #3f3f44;
      font-size: 12px;
      transform: scale(1);
      transition: all 0.2s linear;
    }

    .time {
      color: #3f3f44;
      /*margin-top: .8em;*/
      position: absolute;
      margin-left: 10px;
      bottom: 0;
      margin-bottom: 108px;
      font-size: 12px;
      transform: scale(1);
      transition: all 0.2s linear;
    }

    .content-module:hover p {
      color: #3f3f44;
      transform: scale(1);
      transition: all 0.2s linear;
    }
  }

</style>
