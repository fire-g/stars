import $ from 'jquery'

export default class F {
  constructor (node) {
    this.node = node
  }

  init () {
    const self = this
    this.nodes = []
    Array.prototype.slice.call(self.node, 0).forEach(function (item, index) {
      self.nodes.push(self.update(item))
      self.bindEvents(item, index)
    })
  }

  update (item) {
    return {
      w: item.offsetWidth,
      h: item.offsetHeight,
      l: item.offsetLeft,
      t: item.offsetTop
    }
  }

  bindEvents (item, index) {
    const self = this
    $(item).on('mouseenter', function (e) {
      self.addClass(e, item, 'in', index)
      return false
    })
    $(item).on('mouseleave', function (e) {
      self.addClass(e, item, 'out', index)
      return false
    })
  }

  addClass (e, item, state, index) {
    const direction = this.getDirection(e, index)
    let classSuffix = ''
    switch (direction) {
      case 0:
        classSuffix = '-top'
        break
      case 1:
        classSuffix = '-right'
        break
      case 2:
        classSuffix = '-bottom'
        break
      case 3:
        classSuffix = '-left'
        break
    }
    item.className = ''
    item.classList.add(state + classSuffix)
  }

  getDirection (e, index) {
    const w = this.nodes[index].w
    const h = this.nodes[index].h
    const x = e.pageX - this.nodes[index].l - w / 2
    const y = e.pageY - this.nodes[index].t - h / 2
    // 取到x,y两点坐标
    return (Math.round(((Math.atan2(y, x) * (180 / Math.PI)) + 180) / 90) + 3) % 4// d的数值用于判断方向上下左右。
  }
}
