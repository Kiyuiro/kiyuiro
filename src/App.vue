<template>
  <div id="app">
    <sidebar class="sidebar"></sidebar>
    <top-navigation class="top-navigation"></top-navigation>
    <router-view></router-view>
  </div>
</template>

<script>
  import "@/assets/js/marked.min";
  import Sidebar from "@/components/sidebar/Sidebar";
  import TopNavigation from "@/components/topNavigation/TopNavigation";

  export default {
    name: 'App',
    components: {TopNavigation, Sidebar},
    beforeCreate() {
      let xmlHttp;
      xmlHttp = new XMLHttpRequest();
      xmlHttp.open("POST", " http://192.168.1.3:8888/start", true);
      xmlHttp.send();
    }
  }
</script>

<style>
  @import "./assets/css/base.css";

  @media screen and (max-width: 600px) {
    .sidebar {
      display: none;
    }
    .top-navigation {
      display: block;
    }
  }

  @media screen and (min-width: 600px) {
    .top-navigation {
      display: none;
    }
  }

</style>
