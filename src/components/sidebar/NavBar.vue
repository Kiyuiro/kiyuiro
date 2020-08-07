<template>
  <div id="nav-bar">
    <ul>
      <li v-for="(i, index) in data" :style="{height: itemHeight(index)}" :class="{select: i.isSelect}">
        <nav-bar-item class="item" :path="i.link">
          <!-- ICON -->
          <i :class="i.class" @click="select(index)" slot="icon" class="item-i"></i>
          <!-- LINK -->
          <a target="_blank" @click="select(index)" slot="link" class="item-a">{{i.name}}</a>
          <!-- ARROW -->
          <i v-if="i.children.length > 0"
             class="item-i fa icon-fw fa-angle-right"
             :class="{'fa-rotate-90': i.isSelect}"
             @click="select(index)"
             slot="arrow"></i>
          <!-- CHILDREN -->
          <ul slot="children">
            <li v-for="j in i.children">
              <nav-bar-item class="item item-children">
                <a :href="j.link" target="_blank" slot="link">{{j.name}}</a>
              </nav-bar-item>
            </li>
          </ul>
        </nav-bar-item>
      </li>
    </ul>
  </div>
</template>

<script>
  import NavBarItem from "@/components/sidebar/NavBarItem";

  let data = [
    {name: "首页", class: "fa fa-fw fa-home", isSelect: false, children: [], link: "/home"},
    {
      name: "游戏", class: "fa fa-fw fa-gamepad", isSelect: false, children: [
        {name: "明日方舟工具箱", link: "https://arkn.lolicon.app/#/hr"},
        {name: "少女前线工具箱by命运の乐章", link: "https://hycdes.com/pages/index.html"},
      ]
    },
    {
      name: "项目", class: "fa fa-fw fa-github", isSelect: false, children: [
        {name: "JS扫雷", link: "https://kiyuiru.xyz/assets/game/Minesweeper/game.html"},
      ]
    },
    {
      name: "笔记", class: "fa fa-fw fa-pencil", isSelect: false, children: [
        {name: "JS扫雷", link: "https://kiyuiru.xyz/assets/game/Minesweeper/game.html"},
      ]
    },
    {
      name: "工具", class: "fa fa-fw fa-cube", isSelect: false, children: [
        {name: "LaTeX公式编辑器", link: "https://www.latexlive.com/"},
        {name: "Font Awesome 4", link: "https://fontawesome.dashgame.com/"},
        {name: "Font Awesome 5", link: "https://fa5.dashgame.com/#/"},
        {name: "在线转换文档，图像，视频，音频文件", link: "https://www.aconvert.com/cn/"},
      ]
    },
    {
      name: "链接", class: "fa fa-fw fa-link", isSelect: false, children: [
        {name: "绮羽伊罗", link: "https://kiyuiru.xyz/"},
      ]
    },
    {name: "个人资料", class: "fa fa-fw fa-user", isSelect: false, children: [], link: "/info"},
  ]

  // 判断是否选择
  function select(index) {
    if (data[index].children.length > 0)
      data[index].isSelect = !data[index].isSelect;
  }

  // 计算高度
  function itemHeight(index) {
    if (data[index].isSelect) {
      return "100%";
    } else {
      return "40px";
    }
  }

  export default {
    name: "NavBar",
    components: {NavBarItem},
    data() {
      return {
        data: data
      }
    },
    methods: {
      select,
      itemHeight
    }
  }
</script>

<style scoped>
  .item {
    width: 100%;
    height: 100%;
    overflow: hidden;
  }

  .item-a, .item-i {
    color: #a0a0a5;
  }

  .item:hover, .item:hover .item-a {
    color: white;
    background: #32374A;
  }

  .item-children a {
    color: #a0a0a5;
    margin-left: 25px;
  }

  .item-children:hover, .item-children:hover a {
    color: white;
    background: #3f465e;
  }

  li {
    width: 100%;
    list-style: none;
    left: 0;
  }

  .select {
    background: #2e3344;
  }

  .select .item-a, .select .item-i {
    color: white;
  }
</style>
