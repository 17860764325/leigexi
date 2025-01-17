import request from '@/utils/request'

export function login(data) {
  return request({
    url: '/user/login',
    method: 'post',
    data
  })
}

export function regist(data) {
  return request({
    url: '/user/regist',
    method: 'post',
    data
  })
}

export function getUserInfo() {
  return request({
    url: '/user/info/getUserInfoByToken',
    method: 'get'
  })
}

// 获取用户信息和权限信息
export function getInfo() {
  return request({
    url: '/user/info',
    method: 'get'
  })
}

export function logout() {
  return request({
    url: '/user/logout',
    method: 'post'
  })
}
