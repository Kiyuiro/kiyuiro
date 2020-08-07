<template>
  <div id="sidebar">
    <div class="avatar">
      <avatar class="avatar" path="/home"></avatar>
    </div>
    <personal-link class="personal-link"></personal-link>
    <div class="hr"></div>
    <p class="navigation">Navigation</p>
    <nav-bar class="nav-bar"></nav-bar>
  </div>
</template>

<script>
  import Avatar from "@/components/sidebar/Avatar";
  import PersonalLink from "@/components/sidebar/PersonalLink";
  import NavBar from "@/components/sidebar/NavBar";

  export default {
    name: "Sidebar",
    components: {
      NavBar,
      PersonalLink,
      Avatar
    }
  }
</script>

<style scoped>
  #sidebar {
    width: 15%;
    height: 100%;
    background: #3a3f51;
    position: fixed;
    left: 0;
    bottom: 0;
    top: 0;
    box-shadow: inset -0.25em 0 0.25em 0 rgba(0, 0, 0, 0.125);
    overflow-x: auto;
    transition: all 0.2s linear;
  }

  @media screen and (max-width: 1000px) {
    #sidebar {
      width: 150px;
    }
  }

  #sidebar::-webkit-scrollbar {
    display: none
  }

  .hr {
    height: 1px;
    background: #2e3344;
    border: none;
    margin-bottom: 5px;
  }

  .avatar {
    display: flex;
    padding-top: 5%;
    text-align: center;
  }

  .navigation {
    margin: 4em 0 2em 3em;
    font-size: 5px;
    color: #a0a0a5;
  }

  .nav-bar {
    margin-bottom: 5em;
  }
</style>