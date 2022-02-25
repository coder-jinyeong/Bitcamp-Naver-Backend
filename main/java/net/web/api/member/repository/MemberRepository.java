package net.web.api.member.repository;

import net.web.api.member.domain.BmiDTO;
import net.web.api.member.domain.CalcDTO;

public interface MemberRepository {
    String calc(CalcDTO calc);

    String bmi(BmiDTO bmi);
}
