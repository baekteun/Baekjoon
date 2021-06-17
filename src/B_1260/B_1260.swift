import Foundation

let list = readLine()!.split(separator: " ").map{Int($0)!}
let (n,start) = (list[1],list[2])
var graph = [Int : [Int]]()

for _ in 0..<n{
    let tmp = readLine()!.split(separator: " ").map{Int($0)!}
    let (v1, v2) = (tmp[0],tmp[1])

    if graph[v1] == nil {
        graph[v1] = [v2]
    }
    else{
        graph[v1]?.append(v2)
    }

    if graph[v2] == nil{
        graph[v2] = [v1]
    }
    else{
        graph[v2]?.append(v1)
    }
}
for key in graph.keys{
    graph[key]?.sort(by: >)
}
var DRes = ""
for i in DFS(graph,start){
    DRes += String(i)+" "
}
for key in graph.keys{
    graph[key]?.sort(by: <)
}
var BRes = ""
for i in BFS(graph,start){
    BRes += String(i)+" "
}
print(DRes)
print(BRes)


func DFS(_ graph:[Int: [Int]],_ start: Int) -> [Int]{
    var visited = [Int]()
    var stack = [start]

    while stack.count != 0{
        let node = stack.popLast()!
        if visited.contains(node){
            continue
        }
        else{
            visited.append(node)
            if let nodeWay = graph[node]{
                stack += nodeWay
            }

        }
    }
    return visited
}
func BFS(_ graph: [Int: [Int]],_ start: Int) -> [Int]{
    var visited = [Int]()
    var q = [start]

    while q.count != 0 {
        let node = q.remove(at: 0)
        if visited.contains(node){
            continue
        }
        else{
            visited.append(node)
            if let nodeWay = graph[node]{
                q += nodeWay
            }
        }
    }
    return visited
}