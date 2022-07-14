import request from '@/utils/request'

// 查询访客信息表列表
export function listGuest(query) {
  return request({
    url: '/guest/guest/list',
    method: 'get',
    params: query
  })
}

// 查询访客信息表详细
export function getGuest(guestId) {
  return request({
    url: '/guest/guest/' + guestId,
    method: 'get'
  })
}

// 新增访客信息表
export function addGuest(data) {
  return request({
    url: '/guest/guest',
    method: 'post',
    data: data
  })
}

// 修改访客信息表
export function updateGuest(data) {
  return request({
    url: '/guest/guest',
    method: 'put',
    data: data
  })
}

// 删除访客信息表
export function delGuest(guestId) {
  return request({
    url: '/guest/guest/' + guestId,
    method: 'delete'
  })
}
