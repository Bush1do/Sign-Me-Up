package io.github.bush1do.signmeup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class StateSelect extends AppCompatActivity {

    Button but;

    Spinner spin;

    String[] states={"---","Alabama","Alaska","Arizona","California","Colorado","Connecticut",
                    "Delaware","District of Columbia","Florida","Georgia","Hawaii","Illinois",
                    "Indiana","Iowa","Kansas","Kentucky","Louisiana","Maryland","Massachusetts","Minnesota",
                    "Missouri","Nebraska","Nevada","New Mexico","New York","Ohio","Oregon","Pennsylvania",
                    "Rhode Island","South Carolina","Tennessee","Utah","Vermont","Virginia","Washington",
                    "West Virginia","Wisconsin"};

    ArrayAdapter<String> adapter;

    private void goToUrl(String url){
        Uri site = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW,site);
        startActivity(launchBrowser);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.state_select);

       /* but=(Button) findViewById(R.id.pop);*/
        spin=(Spinner) findViewById(R.id.dropdown1);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,states);

        spin.setAdapter(adapter);

        /* but.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){

                Toast.makeText(StateSelect.this,"hi",Toast.LENGTH_SHORT).show();
            }
        }); */



        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                switch (position){
                    case 0:

                        Log.d("myTag","hi");
                        break;
                    case 1:
                        goToUrl("https://www.alabamainteractive.org/sos/voter_registration/voterRegistrationWelcome.action");
                        break;

                    case 2:
                        goToUrl("https://voterregistration.alaska.gov/");
                        break;
                    case 3:
                        goToUrl("https://servicearizona.com/voterRegistration?popularclick");
                        break;
                    case 4:
                        goToUrl("https://covr.sos.ca.gov/");
                        break;
                    case 5:
                        goToUrl("https://www.sos.state.co.us/voter/pages/pub/olvr/verifyNewVoter.xhtml");
                        break;
                    case 6:
                        goToUrl("https://voterregistration.ct.gov/OLVR/welcome.do");
                        break;
                    case 7:
                        goToUrl("https://ivote.de.gov/voterlogin.aspx");
                        break;
                    case 8:
                        goToUrl("https://www.vote4dc.com/RegisterApply/VoterBasicInfo");
                        break;
                    case 9:
                        goToUrl("https://registertovoteflorida.gov/en/Registration/Eligibility");
                        break;
                    case 10:
                        goToUrl("https://registertovote.sos.ga.gov/GAOLVR/beginRegistration.do");
                        break;
                    case 11:
                        goToUrl("https://olvr.hawaii.gov/register.aspx");
                        break;
                    case 12:
                        goToUrl("https://ova.elections.il.gov/Step0.aspx");
                        break;
                    case 13:
                        goToUrl("https://indianavoters.in.gov/PublicSite/OVR/Introduction.aspx");
                        break;
                    case 14:
                        goToUrl("https://mymvd.iowadot.gov/Account/Login?ReturnUrl=%2fVoterRegistration");
                        break;
                    case 15:
                        goToUrl("https://www.kdor.ks.gov/Apps/VoterReg/secure/default.aspx");
                        break;
                    case 16:
                        goToUrl("https://vrsws.sos.ky.gov/ovrweb/");
                        break;
                    case 17:
                        goToUrl("https://voterportal.sos.la.gov/VoterRegistration");
                        break;
                    case 18:
                        goToUrl("https://voterservices.elections.state.md.us/OnlineVoterRegistration/VoterType");
                        break;
                    case 19:
                        goToUrl("https://www.sec.state.ma.us/ovr/");
                        break;
                    case 20:
                        goToUrl("https://mnvotes.sos.state.mn.us/VoterRegistration/VoterRegistrationMain.aspx");
                        break;
                    case 21:
                        goToUrl("https://s1.sos.mo.gov/votemissouri/request");
                        break;
                    case 22:
                        goToUrl("https://www.nebraska.gov/apps-sos-voter-registration/eligibility/citizen");
                        break;
                    case 23:
                        goToUrl("https://nvsos.gov/sosvoterservices/Registration/step1.aspx");
                        break;
                    case 24:
                        goToUrl("https://portal.sos.state.nm.us/OVR/(S(od4445h5uj2f5tyucvvhszdf))/WebPages/DomesticApplication.aspx");
                        break;
                    case 25:
                        goToUrl("https://voterreg.dmv.ny.gov/MotorVoter/");
                        break;
                    case 26:
                        goToUrl("https://olvr.sos.state.oh.us/AffirmEligibility");
                        break;
                    case 27:
                        goToUrl("https://secure.sos.state.or.us/orestar/vr/register.do?lang=eng&source=SOS");
                        break;
                    case 28:
                        goToUrl("https://www.pavoterservices.pa.gov/Pages/VoterRegistrationApplication.aspx");
                        break;
                    case 29:
                        goToUrl("https://vote.sos.ri.gov/");
                        break;
                    case 30:
                        goToUrl("https://info.scvotes.sc.gov/eng/ovr/start.aspx");
                        break;
                    case 31:
                        goToUrl("https://ovr.govote.tn.gov/Registration/#BM");
                        break;
                    case 32:
                        goToUrl("https://secure.utah.gov/voterreg/login.html?selection=REGISTER");
                        break;
                    case 33:
                        goToUrl("https://olvr.sec.state.vt.us/");
                        break;
                    case 34:
                        goToUrl("https://vote.elections.virginia.gov/Registration/Eligibility");
                        break;
                    case 35:
                        goToUrl("https://weiapplets.sos.wa.gov/MyVote/#/login");
                        break;
                    case 36:
                        goToUrl("https://ovr.sos.wv.gov/Register/Landing#Qualifications");
                        break;
                    case 37:
                        goToUrl("https://myvote.wi.gov/en-us/RegisterToVote");
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?>parent){

            }
        });

    }



}
