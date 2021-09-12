//
//  main.swift
//  algorithm
//
//  Created by baegteun on 2021/09/12.
//

import Foundation

var s = readLine()!.split(separator: " ").map{ Int($0)!}
var L = s[0] * s[1]
var str = readLine()!.split(separator: " ").map{ Int($0)! - L}
for i in str{
    print(i, terminator: " ")
}
