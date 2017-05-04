package com.bg

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

/**
 * @author dmitry.mikhaylovich@bostongene.com
 */
@AutoConfigureRestDocs(outputDir = "build/generated-snippets")
@WebMvcTest(Controller)
class AsciiDoctorApplicationTests extends Specification {

    @Autowired
    MockMvc mockMvc

    def "my first test"()
    {
        given:
        def value = "some value"

        expect:
        this.mockMvc.perform(get("/get/$value"))
                .andExpect(status().isOk())
                .andDo(document("index"));

    }

}
