package com.intelygenz.IntelygenzFAQ;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.helpshift.Helpshift;

public class IntelygenzFAQActivity extends Activity {

    private static final String API_KEY_HELPSHIFT = "614df4b1f3def74dfbe91f670dd79376";
    private static final String API_ID_HELPSHIFT = "intelygenz_platform_20130924195819647-f8abe6eced91953";
    private static final String DOMAIN_HELPSHIFT = "intelygenz.helpshift.com";

    Helpshift hs;
    Button bHelp;
    Button bReportIssue;
    Button bInbox;
    Button bFaqs;
    Button bFaqSection;
    Button bSingleFaq;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intelygenz_faq);

        hs = new Helpshift(IntelygenzFAQActivity.this);
        hs.install(this, API_KEY_HELPSHIFT, DOMAIN_HELPSHIFT, API_ID_HELPSHIFT);

        bHelp = (Button) findViewById(R.id.b_help);
        bHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hs.showSupport(IntelygenzFAQActivity.this);
            }
        });

        bReportIssue = (Button) findViewById(R.id.b_report_issue);
        bReportIssue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hs.showReportIssue(IntelygenzFAQActivity.this);
            }
        });

        bInbox = (Button) findViewById(R.id.b_inbox);
        bInbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hs.showInbox(IntelygenzFAQActivity.this);
            }
        });

        bFaqs = (Button) findViewById(R.id.b_faqs);
        bFaqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hs.showFaqs(IntelygenzFAQActivity.this);
            }
        });

        bFaqSection = (Button) findViewById(R.id.b_faq_section);
        bFaqSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hs.showSection(IntelygenzFAQActivity.this, "1");
            }
        });

        bSingleFaq = (Button) findViewById(R.id.b_single_faq);
        bSingleFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hs.showQuestion(IntelygenzFAQActivity.this, "3");
            }
        });
    }
}
