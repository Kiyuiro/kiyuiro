import Vue from 'vue'
import VueRouter from "vue-router";

import Home from "@/views/home/Home";
import Info from "@/views/info/Info";
import Context from "@/components/context/Context";

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
    component: Context,
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

