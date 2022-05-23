package com.lou.lou_service.Controller;

import com.lou.lou_service.pojo.Experiment;
import com.lou.lou_service.service.ExperimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.activation.FileDataSource;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("menu")
public class ExperimentController {
    @Autowired
    private ExperimentService experimentService;
    @GetMapping("/findAll")
    public List<Experiment> findAll(){
        return experimentService.list();
    }
    @GetMapping("down/{filename}")
    public void download(@PathVariable String filename, HttpServletResponse response)throws IOException {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(filename, StandardCharsets.UTF_8));
        WritableByteChannel writableByteChannel = Channels.newChannel(response.getOutputStream());
        FileChannel fileChannel = new FileInputStream(Paths.get("C:\\Users\\10079\\Desktop\\linux实验\\"+filename).toFile()).getChannel();
        fileChannel.transferTo(0,fileChannel.size(),writableByteChannel);
        fileChannel.close();
        writableByteChannel.close();


    }

}
