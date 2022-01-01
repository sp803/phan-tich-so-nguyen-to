package com.dinhtoan.SpringJPADemo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class PhanTichSo {

	public Map<Integer, Integer> phanTichThanhThuaSoNguyenTo(int n) {
        int i = 2;
        Map<Integer, Integer> listNumbers = new HashMap<>();
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                if(listNumbers.containsKey(i)) {
                	listNumbers.put(i, listNumbers.get(i) + 1);
                }else {
                	listNumbers.put(i, 1);
                }
            } else {
                i++;
            }
        }
        if (listNumbers.isEmpty()) {
            listNumbers.put(n,1);
        }
        return listNumbers;
	}
}
