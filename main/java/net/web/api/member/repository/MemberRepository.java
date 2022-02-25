package net.web.api.member.repository;

import net.web.api.member.domain.*;

public interface MemberRepository {
    String calc(CalcDTO calc);

    String bmi(BmiDTO bmi);

    String grade(GradeDTO grade);

    String login(LoginDTO login);

    String lotto(LottoDTO lotto);
}
