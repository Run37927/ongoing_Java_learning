
import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, 10, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);


            // first
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn = new MidiEvent(a, 1); // tick is actually beat
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 76, 100);
            MidiEvent noteOff = new MidiEvent(b, 4); // change tick here so i can control the duration of the note
            track.add(noteOff);

            ShortMessage c = new ShortMessage();
            c.setMessage(144, 1, 75, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn1 = new MidiEvent(c, 4); // tick is actually beat
            track.add(noteOn1);

            ShortMessage d = new ShortMessage();
            d.setMessage(128, 1, 75, 100);
            MidiEvent noteOff1 = new MidiEvent(d, 8); // change tick here so i can control the duration of the note
            track.add(noteOff1);

            ShortMessage e = new ShortMessage();
            e.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn2 = new MidiEvent(e, 8); // tick is actually beat
            track.add(noteOn2);

            ShortMessage f = new ShortMessage();
            f.setMessage(128, 1, 76, 100);
            MidiEvent noteOff2 = new MidiEvent(f, 12); // change tick here so i can control the duration of the note
            track.add(noteOff2);

            ShortMessage g = new ShortMessage();
            g.setMessage(144, 1, 75, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn3 = new MidiEvent(g, 12); // tick is actually beat
            track.add(noteOn3);

            ShortMessage h = new ShortMessage();
            h.setMessage(128, 1, 75, 100);
            MidiEvent noteOff3 = new MidiEvent(h, 16); // change tick here so i can control the duration of the note
            track.add(noteOff3);

            ShortMessage i = new ShortMessage();
            i.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn4 = new MidiEvent(i, 16); // tick is actually beat
            track.add(noteOn4);

            ShortMessage j = new ShortMessage();
            j.setMessage(128, 1, 76, 100);
            MidiEvent noteOff4 = new MidiEvent(j, 20); // change tick here so i can control the duration of the note
            track.add(noteOff4);

            ShortMessage k = new ShortMessage();
            k.setMessage(144, 1, 71, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn5 = new MidiEvent(k, 20); // tick is actually beat
            track.add(noteOn5);

            ShortMessage l = new ShortMessage();
            l.setMessage(128, 1, 71, 100);
            MidiEvent noteOff5 = new MidiEvent(l, 24); // change tick here so i can control the duration of the note
            track.add(noteOff5);

            ShortMessage m = new ShortMessage();
            m.setMessage(144, 1, 74, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn6 = new MidiEvent(m, 24); // tick is actually beat
            track.add(noteOn6);

            ShortMessage n = new ShortMessage();
            n.setMessage(128, 1, 74, 100);
            MidiEvent noteOff6 = new MidiEvent(n, 28); // change tick here so i can control the duration of the note
            track.add(noteOff6);

            ShortMessage o = new ShortMessage();
            o.setMessage(144, 1, 72, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn7 = new MidiEvent(o, 28); // tick is actually beat
            track.add(noteOn7);

            ShortMessage p = new ShortMessage();
            p.setMessage(128, 1, 72, 100);
            MidiEvent noteOff7 = new MidiEvent(p, 32); // change tick here so i can control the duration of the note
            track.add(noteOff7);

            ShortMessage q = new ShortMessage();
            q.setMessage(144, 1, 69, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn8 = new MidiEvent(q, 32); // tick is actually beat
            track.add(noteOn8);

            ShortMessage r = new ShortMessage();
            r.setMessage(128, 1, 69, 100);
            MidiEvent noteOff8 = new MidiEvent(r, 36); // change tick here so i can control the duration of the note
            track.add(noteOff8);


            // second
            ShortMessage s = new ShortMessage();
            s.setMessage(144, 1, 60, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn9 = new MidiEvent(s, 38); // tick is actually beat
            track.add(noteOn9);

            ShortMessage t = new ShortMessage();
            t.setMessage(128, 1, 60, 100);
            MidiEvent noteOff9 = new MidiEvent(t, 42); // change tick here so i can control the duration of the note
            track.add(noteOff9);

            ShortMessage u = new ShortMessage();
            u.setMessage(144, 1, 64, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn10 = new MidiEvent(u, 42); // tick is actually beat
            track.add(noteOn10);

            ShortMessage v = new ShortMessage();
            v.setMessage(128, 1, 64, 100);
            MidiEvent noteOff10 = new MidiEvent(v, 46); // change tick here so i can control the duration of the note
            track.add(noteOff10);

            ShortMessage w = new ShortMessage();
            w.setMessage(144, 1, 69, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn11 = new MidiEvent(w, 46); // tick is actually beat
            track.add(noteOn11);

            ShortMessage x = new ShortMessage();
            x.setMessage(128, 1, 69, 100);
            MidiEvent noteOff11 = new MidiEvent(x, 50); // change tick here so i can control the duration of the note
            track.add(noteOff11);

            ShortMessage y = new ShortMessage();
            y.setMessage(144, 1, 71, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn12 = new MidiEvent(y, 50); // tick is actually beat
            track.add(noteOn12);

            ShortMessage z = new ShortMessage();
            z.setMessage(128, 1, 71, 100);
            MidiEvent noteOff12 = new MidiEvent(z, 54); // change tick here so i can control the duration of the note
            track.add(noteOff12);

            // third
            ShortMessage aa = new ShortMessage();
            aa.setMessage(144, 1, 64, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn13 = new MidiEvent(aa, 56); // tick is actually beat
            track.add(noteOn13);

            ShortMessage bb = new ShortMessage();
            bb.setMessage(128, 1, 64, 100);
            MidiEvent noteOff13 = new MidiEvent(bb, 60); // change tick here so i can control the duration of the note
            track.add(noteOff13);

            ShortMessage cc = new ShortMessage();
            cc.setMessage(144, 1, 68, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn14 = new MidiEvent(cc, 60); // tick is actually beat
            track.add(noteOn14);

            ShortMessage dd = new ShortMessage();
            dd.setMessage(128, 1, 68, 100);
            MidiEvent noteOff14 = new MidiEvent(dd, 64); // change tick here so i can control the duration of the note
            track.add(noteOff14);

            ShortMessage ee = new ShortMessage();
            ee.setMessage(144, 1, 71, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn15 = new MidiEvent(ee, 64); // tick is actually beat
            track.add(noteOn15);

            ShortMessage ff = new ShortMessage();
            ff.setMessage(128, 1, 71, 100);
            MidiEvent noteOff15 = new MidiEvent(ff, 68); // change tick here so i can control the duration of the note
            track.add(noteOff15);

            ShortMessage gg = new ShortMessage();
            gg.setMessage(144, 1, 72, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn16 = new MidiEvent(gg, 68); // tick is actually beat
            track.add(noteOn16);

            ShortMessage hh = new ShortMessage();
            hh.setMessage(128, 1, 72, 100);
            MidiEvent noteOff16 = new MidiEvent(hh, 72); // change tick here so i can control the duration of the note
            track.add(noteOff16);

            // fourth
            ShortMessage ii = new ShortMessage();
            ii.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn17 = new MidiEvent(ii, 75); // tick is actually beat
            track.add(noteOn17);

            ShortMessage jj = new ShortMessage();
            jj.setMessage(128, 1, 76, 100);
            MidiEvent noteOff17 = new MidiEvent(jj, 79); // change tick here so i can control the duration of the note
            track.add(noteOff17);

            ShortMessage kk = new ShortMessage();
            kk.setMessage(144, 1, 75, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn18 = new MidiEvent(kk, 79); // tick is actually beat
            track.add(noteOn18);

            ShortMessage ll = new ShortMessage();
            ll.setMessage(128, 1, 75, 100);
            MidiEvent noteOff18 = new MidiEvent(ll, 83); // change tick here so i can control the duration of the note
            track.add(noteOff18);

            ShortMessage mm = new ShortMessage();
            mm.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn19 = new MidiEvent(mm, 83); // tick is actually beat
            track.add(noteOn19);

            ShortMessage nn = new ShortMessage();
            nn.setMessage(128, 1, 76, 100);
            MidiEvent noteOff19 = new MidiEvent(nn, 87); // change tick here so i can control the duration of the note
            track.add(noteOff19);

            ShortMessage oo = new ShortMessage();
            oo.setMessage(144, 1, 75, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn20 = new MidiEvent(oo, 87); // tick is actually beat
            track.add(noteOn20);

            ShortMessage pp = new ShortMessage();
            pp.setMessage(128, 1, 75, 100);
            MidiEvent noteOff20 = new MidiEvent(pp, 91); // change tick here so i can control the duration of the note
            track.add(noteOff20);

            ShortMessage qq = new ShortMessage();
            qq.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn21 = new MidiEvent(qq, 91); // tick is actually beat
            track.add(noteOn21);

            ShortMessage rr = new ShortMessage();
            rr.setMessage(128, 1, 76, 100);
            MidiEvent noteOff21 = new MidiEvent(rr, 95); // change tick here so i can control the duration of the note
            track.add(noteOff21);

            ShortMessage ss = new ShortMessage();
            ss.setMessage(144, 1, 71, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn22 = new MidiEvent(ss, 95); // tick is actually beat
            track.add(noteOn22);

            ShortMessage tt = new ShortMessage();
            tt.setMessage(128, 1, 71, 100);
            MidiEvent noteOff22 = new MidiEvent(tt, 99); // change tick here so i can control the duration of the note
            track.add(noteOff22);

            ShortMessage uu = new ShortMessage();
            uu.setMessage(144, 1, 74, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn23 = new MidiEvent(uu, 99); // tick is actually beat
            track.add(noteOn23);

            ShortMessage vv = new ShortMessage();
            vv.setMessage(128, 1, 74, 100);
            MidiEvent noteOff23 = new MidiEvent(vv, 103); // change tick here so i can control the duration of the note
            track.add(noteOff23);

            ShortMessage ww = new ShortMessage();
            ww.setMessage(144, 1, 72, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn24 = new MidiEvent(ww, 103); // tick is actually beat
            track.add(noteOn24);

            ShortMessage xx = new ShortMessage();
            xx.setMessage(128, 1, 72, 100);
            MidiEvent noteOff24 = new MidiEvent(xx, 107); // change tick here so i can control the duration of the note
            track.add(noteOff24);

            ShortMessage yy = new ShortMessage();
            yy.setMessage(144, 1, 69, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn25 = new MidiEvent(yy, 107); // tick is actually beat
            track.add(noteOn25);

            ShortMessage zz = new ShortMessage();
            zz.setMessage(128, 1, 69, 100);
            MidiEvent noteOff25 = new MidiEvent(zz, 111); // change tick here so i can control the duration of the note
            track.add(noteOff25);

            // fifth
            ShortMessage aaa = new ShortMessage();
            aaa.setMessage(144, 1, 60, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn26 = new MidiEvent(aaa, 114); // tick is actually beat
            track.add(noteOn26);

            ShortMessage bbb = new ShortMessage();
            bbb.setMessage(128, 1, 60, 100);
            MidiEvent noteOff26 = new MidiEvent(bbb, 118); // change tick here so i can control the duration of the note
            track.add(noteOff26);

            ShortMessage ccc = new ShortMessage();
            ccc.setMessage(144, 1, 64, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn27 = new MidiEvent(ccc, 118); // tick is actually beat
            track.add(noteOn27);

            ShortMessage ddd = new ShortMessage();
            ddd.setMessage(128, 1, 64, 100);
            MidiEvent noteOff27 = new MidiEvent(ddd, 122); // change tick here so i can control the duration of the note
            track.add(noteOff27);

            ShortMessage eee = new ShortMessage();
            eee.setMessage(144, 1, 69, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn28 = new MidiEvent(eee, 122); // tick is actually beat
            track.add(noteOn28);

            ShortMessage fff = new ShortMessage();
            fff.setMessage(128, 1, 69, 100);
            MidiEvent noteOff28 = new MidiEvent(fff, 126); // change tick here so i can control the duration of the note
            track.add(noteOff28);

            ShortMessage ggg = new ShortMessage();
            ggg.setMessage(144, 1, 71, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn29 = new MidiEvent(ggg, 126); // tick is actually beat
            track.add(noteOn29);

            ShortMessage hhh = new ShortMessage();
            hhh.setMessage(128, 1, 71, 100);
            MidiEvent noteOff29 = new MidiEvent(hhh, 130); // change tick here so i can control the duration of the note
            track.add(noteOff29);

            //sixth
            ShortMessage iii = new ShortMessage();
            iii.setMessage(144, 1, 62, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn30 = new MidiEvent(iii, 133); // tick is actually beat
            track.add(noteOn30);

            ShortMessage jjj = new ShortMessage();
            jjj.setMessage(128, 1, 62, 100);
            MidiEvent noteOff30 = new MidiEvent(jjj, 137); // change tick here so i can control the duration of the note
            track.add(noteOff30);

            ShortMessage kkk = new ShortMessage();
            kkk.setMessage(144, 1, 72, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn31 = new MidiEvent(kkk, 137); // tick is actually beat
            track.add(noteOn31);

            ShortMessage lll = new ShortMessage();
            lll.setMessage(128, 1, 72, 100);
            MidiEvent noteOff31 = new MidiEvent(lll, 141); // change tick here so i can control the duration of the note
            track.add(noteOff31);

            ShortMessage mmm = new ShortMessage();
            mmm.setMessage(144, 1, 71, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn32 = new MidiEvent(mmm, 141); // tick is actually beat
            track.add(noteOn32);

            ShortMessage nnn = new ShortMessage();
            nnn.setMessage(128, 1, 71, 100);
            MidiEvent noteOff32 = new MidiEvent(nnn, 145); // change tick here so i can control the duration of the note
            track.add(noteOff32);

            ShortMessage ooo = new ShortMessage();
            ooo.setMessage(144, 1, 69, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn33 = new MidiEvent(ooo, 145); // tick is actually beat
            track.add(noteOn33);

            ShortMessage ppp = new ShortMessage();
            ppp.setMessage(128, 1, 69, 100);
            MidiEvent noteOff33 = new MidiEvent(ppp, 149); // change tick here so i can control the duration of the note
            track.add(noteOff33);

            // seventh
            ShortMessage qqq = new ShortMessage();
            qqq.setMessage(144, 1, 71, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn34 = new MidiEvent(qqq, 152); // tick is actually beat
            track.add(noteOn34);

            ShortMessage rrr = new ShortMessage();
            rrr.setMessage(128, 1, 71, 100);
            MidiEvent noteOff34 = new MidiEvent(rrr, 156); // change tick here so i can control the duration of the note
            track.add(noteOff34);

            ShortMessage sss = new ShortMessage();
            sss.setMessage(144, 1, 72, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn35 = new MidiEvent(sss, 156); // tick is actually beat
            track.add(noteOn35);

            ShortMessage ttt = new ShortMessage();
            ttt.setMessage(128, 1, 72, 100);
            MidiEvent noteOff35 = new MidiEvent(ttt, 160); // change tick here so i can control the duration of the note
            track.add(noteOff35);

            ShortMessage uuu = new ShortMessage();
            uuu.setMessage(144, 1, 74, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn36 = new MidiEvent(uuu, 160); // tick is actually beat
            track.add(noteOn36);

            ShortMessage vvv = new ShortMessage();
            vvv.setMessage(128, 1, 74, 100);
            MidiEvent noteOff36 = new MidiEvent(vvv, 164); // change tick here so i can control the duration of the note
            track.add(noteOff36);

            ShortMessage www = new ShortMessage();
            www.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn37 = new MidiEvent(www, 164); // tick is actually beat
            track.add(noteOn37);

            ShortMessage xxx = new ShortMessage();
            xxx.setMessage(128, 1, 76, 100);
            MidiEvent noteOff37 = new MidiEvent(xxx, 168); // change tick here so i can control the duration of the note
            track.add(noteOff37);

            // eighth
            ShortMessage yyy = new ShortMessage();
            yyy.setMessage(144, 1, 67, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn38 = new MidiEvent(yyy, 171); // tick is actually beat
            track.add(noteOn38);

            ShortMessage zzz = new ShortMessage();
            zzz.setMessage(128, 1, 67, 100);
            MidiEvent noteOff38 = new MidiEvent(zzz, 175); // change tick here so i can control the duration of the note
            track.add(noteOff38);

            ShortMessage aaaa = new ShortMessage();
            aaaa.setMessage(144, 1, 77, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn39 = new MidiEvent(aaaa, 175); // tick is actually beat
            track.add(noteOn39);

            ShortMessage bbbb = new ShortMessage();
            bbbb.setMessage(128, 1, 77, 100);
            MidiEvent noteOff39 = new MidiEvent(bbbb, 179); // change tick here so i can control the duration of the note
            track.add(noteOff39);

            ShortMessage cccc = new ShortMessage();
            cccc.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn40 = new MidiEvent(cccc, 179); // tick is actually beat
            track.add(noteOn40);

            ShortMessage dddd = new ShortMessage();
            dddd.setMessage(128, 1, 76, 100);
            MidiEvent noteOff40 = new MidiEvent(dddd, 183); // change tick here so i can control the duration of the note
            track.add(noteOff40);

            ShortMessage eeee = new ShortMessage();
            eeee.setMessage(144, 1, 74, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn41 = new MidiEvent(eeee, 183); // tick is actually beat
            track.add(noteOn41);

            ShortMessage ffff = new ShortMessage();
            ffff.setMessage(128, 1, 74, 100);
            MidiEvent noteOff41 = new MidiEvent(ffff, 187); // change tick here so i can control the duration of the note
            track.add(noteOff41);

            // ninth
            ShortMessage gggg = new ShortMessage();
            gggg.setMessage(144, 1, 65, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn42 = new MidiEvent(gggg, 190); // tick is actually beat
            track.add(noteOn42);

            ShortMessage hhhh = new ShortMessage();
            hhhh.setMessage(128, 1, 65, 100);
            MidiEvent noteOff42 = new MidiEvent(hhhh, 194); // change tick here so i can control the duration of the note
            track.add(noteOff42);

            ShortMessage iiii = new ShortMessage();
            iiii.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn43 = new MidiEvent(iiii, 194); // tick is actually beat
            track.add(noteOn43);

            ShortMessage jjjj = new ShortMessage();
            jjjj.setMessage(128, 1, 76, 100);
            MidiEvent noteOff43 = new MidiEvent(jjjj, 198); // change tick here so i can control the duration of the note
            track.add(noteOff43);


            ShortMessage kkkk = new ShortMessage();
            kkkk.setMessage(144, 1, 74, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn44 = new MidiEvent(kkkk, 198); // tick is actually beat
            track.add(noteOn44);

            ShortMessage llll = new ShortMessage();
            llll.setMessage(128, 1, 74, 100);
            MidiEvent noteOff44 = new MidiEvent(llll, 202); // change tick here so i can control the duration of the note
            track.add(noteOff44);

            ShortMessage mmmm = new ShortMessage();
            mmmm.setMessage(144, 1, 72, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn45 = new MidiEvent(mmmm, 202); // tick is actually beat
            track.add(noteOn45);

            ShortMessage nnnn = new ShortMessage();
            nnnn.setMessage(128, 1, 72, 100);
            MidiEvent noteOff45 = new MidiEvent(nnnn, 206); // change tick here so i can control the duration of the note
            track.add(noteOff45);


            // tenth
            ShortMessage oooo = new ShortMessage();
            oooo.setMessage(144, 1, 64, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn46 = new MidiEvent(oooo, 209); // tick is actually beat
            track.add(noteOn46);

            ShortMessage pppp = new ShortMessage();
            pppp.setMessage(128, 1, 64, 100);
            MidiEvent noteOff46 = new MidiEvent(pppp, 213); // change tick here so i can control the duration of the note
            track.add(noteOff46);

            ShortMessage qqqq = new ShortMessage();
            qqqq.setMessage(144, 1, 74, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn47 = new MidiEvent(qqqq, 213); // tick is actually beat
            track.add(noteOn47);

            ShortMessage rrrr = new ShortMessage();
            rrrr.setMessage(128, 1, 74, 100);
            MidiEvent noteOff47 = new MidiEvent(rrrr, 217); // change tick here so i can control the duration of the note
            track.add(noteOff47);

            ShortMessage ssss = new ShortMessage();
            ssss.setMessage(144, 1, 72, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn48 = new MidiEvent(ssss, 217); // tick is actually beat
            track.add(noteOn48);

            ShortMessage tttt = new ShortMessage();
            tttt.setMessage(128, 1, 72, 100);
            MidiEvent noteOff48 = new MidiEvent(tttt, 221); // change tick here so i can control the duration of the note
            track.add(noteOff48);

            ShortMessage uuuu = new ShortMessage();
            uuuu.setMessage(144, 1, 71, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn49 = new MidiEvent(uuuu, 221); // tick is actually beat
            track.add(noteOn49);

            ShortMessage vvvv = new ShortMessage();
            vvvv.setMessage(128, 1, 71, 100);
            MidiEvent noteOff49 = new MidiEvent(vvvv, 225); // change tick here so i can control the duration of the note
            track.add(noteOff49);

            // eleventh
            ShortMessage wwww = new ShortMessage();
            wwww.setMessage(144, 1, 64, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn50 = new MidiEvent(wwww, 228); // tick is actually beat
            track.add(noteOn50);

            ShortMessage xxxx = new ShortMessage();
            xxxx.setMessage(128, 1, 64, 100);
            MidiEvent noteOff50 = new MidiEvent(xxxx, 232); // change tick here so i can control the duration of the note
            track.add(noteOff50);

            ShortMessage yyyy = new ShortMessage();
            yyyy.setMessage(144, 1, 64, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn51 = new MidiEvent(yyyy, 232); // tick is actually beat
            track.add(noteOn51);

            ShortMessage zzzz = new ShortMessage();
            zzzz.setMessage(128, 1, 64, 100);
            MidiEvent noteOff51 = new MidiEvent(zzzz, 236); // change tick here so i can control the duration of the note
            track.add(noteOff51);

            ShortMessage aaaaa = new ShortMessage();
            aaaaa.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn52 = new MidiEvent(aaaaa, 236); // tick is actually beat
            track.add(noteOn52);

            ShortMessage bbbbb = new ShortMessage();
            bbbbb.setMessage(128, 1, 76, 100);
            MidiEvent noteOff52 = new MidiEvent(bbbbb, 240); // change tick here so i can control the duration of the note
            track.add(noteOff52);

            ShortMessage ccccc = new ShortMessage();
            ccccc.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn53 = new MidiEvent(ccccc, 240); // tick is actually beat
            track.add(noteOn53);

            ShortMessage ddddd = new ShortMessage();
            ddddd.setMessage(128, 1, 76, 100);
            MidiEvent noteOff53 = new MidiEvent(ddddd, 244); // change tick here so i can control the duration of the note
            track.add(noteOff53);

            ShortMessage eeeee = new ShortMessage();
            eeeee.setMessage(144, 1, 75, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn54 = new MidiEvent(eeeee, 244); // tick is actually beat
            track.add(noteOn54);

            ShortMessage fffff = new ShortMessage();
            fffff.setMessage(128, 1, 75, 100);
            MidiEvent noteOff54 = new MidiEvent(fffff, 248); // change tick here so i can control the duration of the note
            track.add(noteOff54);

            ShortMessage ggggg = new ShortMessage();
            ggggg.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn55 = new MidiEvent(ggggg, 248); // tick is actually beat
            track.add(noteOn55);

            ShortMessage hhhhh = new ShortMessage();
            hhhhh.setMessage(128, 1, 76, 100);
            MidiEvent noteOff55 = new MidiEvent(hhhhh, 252); // change tick here so i can control the duration of the note
            track.add(noteOff55);

            ShortMessage iiiii = new ShortMessage();
            iiiii.setMessage(144, 1, 75, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn56 = new MidiEvent(iiiii, 252); // tick is actually beat
            track.add(noteOn56);

            ShortMessage jjjjj = new ShortMessage();
            jjjjj.setMessage(128, 1, 75, 100);
            MidiEvent noteOff56 = new MidiEvent(jjjjj, 256); // change tick here so i can control the duration of the note
            track.add(noteOff56);

            // final
            ShortMessage kkkkk = new ShortMessage();
            kkkkk.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn57 = new MidiEvent(kkkkk, 256); // tick is actually beat
            track.add(noteOn57);

            ShortMessage lllll = new ShortMessage();
            lllll.setMessage(128, 1, 76, 100);
            MidiEvent noteOff57 = new MidiEvent(lllll, 260); // change tick here so i can control the duration of the note
            track.add(noteOff57);

            ShortMessage mmmmm = new ShortMessage();
            mmmmm.setMessage(144, 1, 75, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn58 = new MidiEvent(mmmmm, 260); // tick is actually beat
            track.add(noteOn58);

            ShortMessage nnnnn = new ShortMessage();
            nnnnn.setMessage(128, 1, 75, 100);
            MidiEvent noteOff58 = new MidiEvent(nnnnn, 264); // change tick here so i can control the duration of the note
            track.add(noteOff58);

            ShortMessage ooooo = new ShortMessage();
            ooooo.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn59 = new MidiEvent(ooooo, 264); // tick is actually beat
            track.add(noteOn59);

            ShortMessage ppppp = new ShortMessage();
            ppppp.setMessage(128, 1, 76, 100);
            MidiEvent noteOff59 = new MidiEvent(ppppp, 268); // change tick here so i can control the duration of the note
            track.add(noteOff59);

            ShortMessage qqqqq = new ShortMessage();
            qqqqq.setMessage(144, 1, 75, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn60 = new MidiEvent(qqqqq, 268); // tick is actually beat
            track.add(noteOn60);

            ShortMessage rrrrr = new ShortMessage();
            rrrrr.setMessage(128, 1, 75, 100);
            MidiEvent noteOff60 = new MidiEvent(rrrrr, 272); // change tick here so i can control the duration of the note
            track.add(noteOff60);

            ShortMessage sssss = new ShortMessage();
            sssss.setMessage(144, 1, 76, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn61 = new MidiEvent(sssss, 272); // tick is actually beat
            track.add(noteOn61);

            ShortMessage ttttt = new ShortMessage();
            ttttt.setMessage(128, 1, 76, 100);
            MidiEvent noteOff61 = new MidiEvent(ttttt, 276); // change tick here so i can control the duration of the note
            track.add(noteOff61);

            ShortMessage uuuuu = new ShortMessage();
            uuuuu.setMessage(144, 1, 71, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn62 = new MidiEvent(uuuuu, 276); // tick is actually beat
            track.add(noteOn62);

            ShortMessage vvvvv = new ShortMessage();
            vvvvv.setMessage(128, 1, 71, 100);
            MidiEvent noteOff62 = new MidiEvent(vvvvv, 280); // change tick here so i can control the duration of the note
            track.add(noteOff62);

            ShortMessage wwwww = new ShortMessage();
            wwwww.setMessage(144, 1, 74, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn63 = new MidiEvent(wwwww, 280); // tick is actually beat
            track.add(noteOn63);

            ShortMessage xxxxx = new ShortMessage();
            xxxxx.setMessage(128, 1, 74, 100);
            MidiEvent noteOff63 = new MidiEvent(xxxxx, 284); // change tick here so i can control the duration of the note
            track.add(noteOff63);

            ShortMessage yyyyy = new ShortMessage();
            yyyyy.setMessage(144, 1, 72, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn64 = new MidiEvent(yyyyy, 284); // tick is actually beat
            track.add(noteOn64);

            ShortMessage zzzzz = new ShortMessage();
            zzzzz.setMessage(128, 1, 72, 100);
            MidiEvent noteOff64 = new MidiEvent(zzzzz, 288); // change tick here so i can control the duration of the note
            track.add(noteOff64);

            ShortMessage aaaaaa = new ShortMessage();
            aaaaaa.setMessage(144, 1, 69, 100); // message type, channel, note to play, velocity
            MidiEvent noteOn65 = new MidiEvent(aaaaaa, 288); // tick is actually beat
            track.add(noteOn65);

            ShortMessage bbbbbb = new ShortMessage();
            bbbbbb.setMessage(128, 1, 69, 100);
            MidiEvent noteOff65 = new MidiEvent(bbbbbb, 292); // change tick here so i can control the duration of the note
            track.add(noteOff65);


            player.setSequence(seq); // like putting the CD in the CD player
            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
