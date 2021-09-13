//
//  B_3003.swift
//  algorithm
//
//  Created by baegteun on 2021/09/12.
//

import Foundation

var s = readLine()!.split(separator: " ").map{ Int($0)!}
var chess = [1,1,2,2,2,8]
for (i,v) in chess.enumerated(){
    print(v-s[i])
}
