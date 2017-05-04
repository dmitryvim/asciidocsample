package com.bg

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

/**
 * @author dmitry.mikhaylovich@bostongene.com
 */
@WebMvcTest
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

    }

}
