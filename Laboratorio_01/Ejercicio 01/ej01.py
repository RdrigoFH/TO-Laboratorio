def sum_array(arr: list):
    res = 0
    for i in range(len(arr)):
        res += arr[i]
    return res


print(sum_array([1, 2, 3, 4, 5, 6, 7, 8, 9]))
