package com.example.paijoo_rest_api.model.RequestBody;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TextContentRequestBody implements ContentRequestBody {
    private String text;
}
