<template>
  <div id="content">
    <content-module v-for="i in data[0]" class="content-module" :path="i.link">
      <div :style="{'background': 'url(' + i.img + ')', 'background-size': 'cover'}" slot="img" class="img">
        <div class="black"></div>
      </div>
      <h2 slot="title" class="title">{{i.title}}</h2>
      <p slot="summary" class="summary">{{i.summary}}</p>
      <p slot="time" class="time">{{i.time}}</p>
    </content-module>
  </div>
</template>

<script>
  import ContentModule from "@/components/content/ContentModule";

  let data = [
    [
      {
        title: "Test",
        img: require("@/assets/img/content/0-0.jpg"),
        summary: "This is a test text xxxxxxxxxxx x x x x x x x x x x x x x x x x x x x x x x x x",
        time: "2020-7-14",
        link: ""
      },
      {
        title: "Test",
        img: require("@/assets/img/content/0-1.jpg"),
        summary: "This is a test text",
        time: "2020-7-14",
        link: ""
      },
      {
        title: "Test",
        img: require("@/assets/img/content/0-2.jpg"),
        summary: "This is a test text",
        time: "2020-7-14",
        link: ""
      },
      {
        title: "Test",
        img: require("@/assets/img/content/0-3.jpg"),
        summary: "This is a test text",
        time: "2020-7-14",
        link: ""
      },
      {
        title: "Test",
        img: require("@/assets/img/content/0-4.jpg"),
        summary: "This is a test text",
        time: "2020-7-14",
        link: ""
      },
      {
        title: "Test",
        img: require("@/assets/img/content/0-5.jpg"),
        summary: "This is a test text",
        time: "2020-7-14",
        link: ""
      },
      {
        title: "Test",
        img: require("@/assets/img/content/0-6.jpg"),
        summary: "This is a test text",
        time: "2020-7-14",
        link: ""
      },
      {
        title: "Font Awesome",
        img: require("@/assets/img/content/0-7.jpg"),
        summary: "一套绝佳的图标字体库和CSS框架",
        time: "2020-7-17",
        link: ""
      },
    ]
  ]

  export default {
    name: "Content",
    components: {ContentModule},
    data() {
      return {
        data: data
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