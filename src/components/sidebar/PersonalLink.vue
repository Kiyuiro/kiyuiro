<template>
  <div id="personal-link">
    <ul>
      <li>
        <personal-link-item v-for="i in link" class="item">
          <a :href="i.link" :class="i.icon" target="_blank" class="fa-q"></a>
        </personal-link-item>
      </li>
    </ul>
  </div>
</template>

<script>
  import PersonalLinkItem from "@/components/sidebar/PersonalLinkItem";

  const link = [
    {name: "Github", link: "https://github.com/Kiyuiro", icon: "fa fa-fw fa-github"},
    {name: "Github", link: "https://twitter.com/Kiyuiru", icon: "fa fa-fw fa-twitter"},
    {name: "Github", link: "https://steamcommunity.com/profiles/76561198308398351/", icon: "fa fa-fw fa-steam"},
    {name: "Github", link: "http://wpa.qq.com/msgrd?v=3&uin=1713560379&site=qq&menu=yes", icon: "fa fa-fw fa-qq"},
  ]

  export default {
    name: "PersonalLink",
    components: {PersonalLinkItem},
    data() {
      return {
        link,
      }
    }
  }
</script>

<style scoped>
  #personal-link {
    text-align: center;
    margin-bottom: 1em;
  }

  .item {
    width: 30px;
    height: 100%;
    color: #a0a0a5;
    display: inline-block;
    margin-left: 0.2em;
  }

  .item a {
    color: #a0a0a5;
    font-size: 18px;
  }

  .item a:hover {
    color: white;
  }

  li {
    width: 100%;
    height: 100%;
    list-style: none;
    display: block;
    margin-left: auto;
    margin-right: auto;
  }
</style>