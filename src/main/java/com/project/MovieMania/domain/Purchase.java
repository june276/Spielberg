package com.project.MovieMania.domain;

import lombok.Data;

@Data
public class Purchase {

    private String tid;

    private String next_redirect_pc_url;

    private String partner_order_id;
}
