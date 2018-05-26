package com.jainsp.converter;

import com.jainsp.dto.SkillDto;
import com.jainsp.entity.Skill;

public class SkillConverter {

    public static Skill dtoToEntity(SkillDto SkillDto) {
        com.jainsp.entity.Skill Skill = new Skill(SkillDto.getSkillName(), null);
        Skill.setSkillId(SkillDto.getSkillId());

        return Skill;
    }

    public static SkillDto entityToDto(Skill skill) {
        return new SkillDto(skill.getSkillId(), skill.getSkillName());
    }
}
