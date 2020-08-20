import Vue from 'vue'
import VueRouter from "vue-router";

import Home from "@/views/home/Home";
import Info from "@/views/info/Info";
import Content from "@/components/context/Content";

Vue.use(VueRouter)

const routes = [
  {
    path: "",
    component: Home,
  },
  {
    path: "/home",
    component: Home,
  },
  {
    path: "/page/:id",
    component: Content,
  },
  {
    path: "/info",
    component: Info,
  }
]

const router = new VueRouter({
  routes,
  mode: "history"
})

export default router

