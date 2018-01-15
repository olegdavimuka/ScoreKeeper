package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class BasketballFragment extends Fragment {

    public BasketballFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.basketball_layout, container, false);

        // Team_1 team
        final BasketballTeam Team_1 = new BasketballTeam(getString(R.string.basketball_team_1), 0,
                0, 0, 0, 0,
                0, 0, 0);

        Team_1.setOnePointThrowsCountButton((Button) rootView.findViewById(R.id.basketballTeam_1_OnePointButton));
        Team_1.setTwoPointsThrowsCountButton((Button) rootView.findViewById(R.id.basketballTeam_1_TwoPointsButton));
        Team_1.setThreePointsThrowsCountButton((Button) rootView.findViewById(R.id.basketballTeam_1_ThreePointsButton));
        Team_1.setBlockadesCountButton((Button) rootView.findViewById(R.id.basketballTeam_1_BlockadeButton));
        Team_1.setInterceptionsCountButton((Button) rootView.findViewById(R.id.basketballTeam_1_InterceptionButton));
        Team_1.setFoulsCountButton((Button) rootView.findViewById(R.id.basketballTeam_1_FoulButton));
        Team_1.setBallPicksCountButton((Button) rootView.findViewById(R.id.basketballTeam_1_BallPickButton));

        // Team_1 players
        Player Team_1_Player_1 = new Player(Team_1.getName(),
                getString(R.string.basketball_team_1_player_1), 0, 0);

        Team_1_Player_1.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_1_Player_1_Button));
        Team_1_Player_1.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_1_Record_1_Button));
        Team_1_Player_1.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_1_Record_2_Button));

        Player Team_1_Player_2 = new Player(Team_1.getName(),
                getString(R.string.basketball_team_1_player_2), 0, 0);

        Team_1_Player_2.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_1_Player_2_Button));
        Team_1_Player_2.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_2_Record_1_Button));
        Team_1_Player_2.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_2_Record_2_Button));

        Player Team_1_Player_3 = new Player(Team_1.getName(),
                getString(R.string.basketball_team_1_player_3), 0, 0);

        Team_1_Player_3.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_1_Player_3_Button));
        Team_1_Player_3.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_3_Record_1_Button));
        Team_1_Player_3.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_3_Record_2_Button));

        Player Team_1_Player_4 = new Player(Team_1.getName(),
                getString(R.string.basketball_team_1_player_4), 0, 0);

        Team_1_Player_4.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_1_Player_4_Button));
        Team_1_Player_4.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_4_Record_1_Button));
        Team_1_Player_4.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_4_Record_2_Button));

        Player Team_1_Player_5 = new Player(Team_1.getName(),
                getString(R.string.basketball_team_1_player_5), 0, 0);

        Team_1_Player_5.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_1_Player_5_Button));
        Team_1_Player_5.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_5_Record_1_Button));
        Team_1_Player_5.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_5_Record_2_Button));

        Player Team_1_Player_6 = new Player(Team_1.getName(),
                getString(R.string.basketball_team_1_player_6), 0, 0);

        Team_1_Player_6.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_1_Player_6_Button));
        Team_1_Player_6.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_6_Record_1_Button));
        Team_1_Player_6.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_6_Record_2_Button));

        Player Team_1_Player_7 = new Player(Team_1.getName(),
                getString(R.string.basketball_team_1_player_7), 0, 0);

        Team_1_Player_7.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_1_Player_7_Button));
        Team_1_Player_7.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_7_Record_1_Button));
        Team_1_Player_7.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_7_Record_2_Button));

        Player Team_1_Player_8 = new Player(Team_1.getName(),
                getString(R.string.basketball_team_1_player_8), 0, 0);

        Team_1_Player_8.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_1_Player_8_Button));
        Team_1_Player_8.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_8_Record_1_Button));
        Team_1_Player_8.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_8_Record_2_Button));

        Player Team_1_Player_9 = new Player(Team_1.getName(),
                getString(R.string.basketball_team_1_player_9), 0, 0);

        Team_1_Player_9.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_1_Player_9_Button));
        Team_1_Player_9.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_9_Record_1_Button));
        Team_1_Player_9.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_9_Record_2_Button));

        Player Team_1_Player_10 = new Player(Team_1.getName(),
                getString(R.string.basketball_team_1_player_10), 0, 0);

        Team_1_Player_10.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_1_Player_10_Button));
        Team_1_Player_10.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_10_Record_1_Button));
        Team_1_Player_10.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_10_Record_2_Button));

        Player Team_1_Player_11 = new Player(Team_1.getName(),
                getString(R.string.basketball_team_1_player_11), 0, 0);

        Team_1_Player_11.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_1_Player_11_Button));
        Team_1_Player_11.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_11_Record_1_Button));
        Team_1_Player_11.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_11_Record_2_Button));

        Player Team_1_Player_12 = new Player(Team_1.getName(),
                getString(R.string.basketball_team_1_player_12), 0, 0);

        Team_1_Player_12.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_1_Player_12_Button));
        Team_1_Player_12.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_12_Record_1_Button));
        Team_1_Player_12.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_1_Player_12_Record_2_Button));

        ArrayList<Player> Team_1_Players = new ArrayList<>();
        Team_1_Players.add(Team_1_Player_1);
        Team_1_Players.add(Team_1_Player_2);
        Team_1_Players.add(Team_1_Player_3);
        Team_1_Players.add(Team_1_Player_4);
        Team_1_Players.add(Team_1_Player_5);
        Team_1_Players.add(Team_1_Player_6);
        Team_1_Players.add(Team_1_Player_7);
        Team_1_Players.add(Team_1_Player_8);
        Team_1_Players.add(Team_1_Player_9);
        Team_1_Players.add(Team_1_Player_10);
        Team_1_Players.add(Team_1_Player_11);
        Team_1_Players.add(Team_1_Player_12);

        Team_1.setPlayers(Team_1_Players);

        // Team_2 team
        final BasketballTeam Team_2 = new BasketballTeam(getString(R.string.basketball_team_2), 0,
                0, 0, 0, 0,
                0, 0, 0);

        Team_2.setOnePointThrowsCountButton((Button) rootView.findViewById(R.id.basketballTeam_2_OnePointButton));
        Team_2.setTwoPointsThrowsCountButton((Button) rootView.findViewById(R.id.basketballTeam_2_TwoPointsButton));
        Team_2.setThreePointsThrowsCountButton((Button) rootView.findViewById(R.id.basketballTeam_2_ThreePointsButton));
        Team_2.setBlockadesCountButton((Button) rootView.findViewById(R.id.basketballTeam_2_BlockadeButton));
        Team_2.setInterceptionsCountButton((Button) rootView.findViewById(R.id.basketballTeam_2_InterceptionButton));
        Team_2.setFoulsCountButton((Button) rootView.findViewById(R.id.basketballTeam_2_FoulButton));
        Team_2.setBallPicksCountButton((Button) rootView.findViewById(R.id.basketballTeam_2_BallPickButton));

        // Team_2 players
        Player Team_2_Player_1 = new Player(Team_2.getName(),
                getString(R.string.basketball_team_2_player_1), 0, 0);

        Team_2_Player_1.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_2_Player_1_Button));
        Team_2_Player_1.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_1_Record_1_Button));
        Team_2_Player_1.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_1_Record_2_Button));

        Player Team_2_Player_2 = new Player(Team_2.getName(),
                getString(R.string.basketball_team_2_player_2), 0, 0);

        Team_2_Player_2.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_2_Player_2_Button));
        Team_2_Player_2.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_2_Record_1_Button));
        Team_2_Player_2.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_2_Record_2_Button));

        Player Team_2_Player_3 = new Player(Team_2.getName(),
                getString(R.string.basketball_team_2_player_3), 0, 0);

        Team_2_Player_3.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_2_Player_3_Button));
        Team_2_Player_3.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_3_Record_1_Button));
        Team_2_Player_3.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_3_Record_2_Button));

        Player Team_2_Player_4 = new Player(Team_2.getName(),
                getString(R.string.basketball_team_2_player_4), 0, 0);

        Team_2_Player_4.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_2_Player_4_Button));
        Team_2_Player_4.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_4_Record_1_Button));
        Team_2_Player_4.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_4_Record_2_Button));

        Player Team_2_Player_5 = new Player(Team_2.getName(),
                getString(R.string.basketball_team_2_player_5), 0, 0);

        Team_2_Player_5.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_2_Player_5_Button));
        Team_2_Player_5.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_5_Record_1_Button));
        Team_2_Player_5.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_5_Record_2_Button));

        Player Team_2_Player_6 = new Player(Team_2.getName(),
                getString(R.string.basketball_team_2_player_6), 0, 0);

        Team_2_Player_6.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_2_Player_6_Button));
        Team_2_Player_6.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_6_Record_1_Button));
        Team_2_Player_6.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_6_Record_2_Button));

        Player Team_2_Player_7 = new Player(Team_2.getName(),
                getString(R.string.basketball_team_2_player_7), 0, 0);

        Team_2_Player_7.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_2_Player_7_Button));
        Team_2_Player_7.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_7_Record_1_Button));
        Team_2_Player_7.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_7_Record_2_Button));

        Player Team_2_Player_8 = new Player(Team_2.getName(),
                getString(R.string.basketball_team_2_player_8), 0, 0);

        Team_2_Player_8.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_2_Player_8_Button));
        Team_2_Player_8.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_8_Record_1_Button));
        Team_2_Player_8.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_8_Record_2_Button));

        Player Team_2_Player_9 = new Player(Team_2.getName(),
                getString(R.string.basketball_team_2_player_9), 0, 0);

        Team_2_Player_9.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_2_Player_9_Button));
        Team_2_Player_9.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_9_Record_1_Button));
        Team_2_Player_9.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_9_Record_2_Button));

        Player Team_2_Player_10 = new Player(Team_2.getName(),
                getString(R.string.basketball_team_2_player_10), 0, 0);

        Team_2_Player_10.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_2_Player_10_Button));
        Team_2_Player_10.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_10_Record_1_Button));
        Team_2_Player_10.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_10_Record_2_Button));

        Player Team_2_Player_11 = new Player(Team_2.getName(),
                getString(R.string.basketball_team_2_player_11), 0, 0);

        Team_2_Player_11.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_2_Player_11_Button));
        Team_2_Player_11.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_11_Record_1_Button));
        Team_2_Player_11.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_11_Record_2_Button));

        Player Team_2_Player_12 = new Player(Team_2.getName(),
                getString(R.string.basketball_team_2_player_12), 0, 0);

        Team_2_Player_12.setPlayerButton((Button) rootView.findViewById(R.id.basketballTeam_2_Player_12_Button));
        Team_2_Player_12.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_12_Record_1_Button));
        Team_2_Player_12.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.basketballTeam_2_Player_12_Record_2_Button));

        ArrayList<Player> Team_2_Players = new ArrayList<>();
        Team_2_Players.add(Team_2_Player_1);
        Team_2_Players.add(Team_2_Player_2);
        Team_2_Players.add(Team_2_Player_3);
        Team_2_Players.add(Team_2_Player_4);
        Team_2_Players.add(Team_2_Player_5);
        Team_2_Players.add(Team_2_Player_6);
        Team_2_Players.add(Team_2_Player_7);
        Team_2_Players.add(Team_2_Player_8);
        Team_2_Players.add(Team_2_Player_9);
        Team_2_Players.add(Team_2_Player_10);
        Team_2_Players.add(Team_2_Player_11);
        Team_2_Players.add(Team_2_Player_12);

        Team_2.setPlayers(Team_2_Players);

        // Show/hide players and reset buttons
        final Button showHideButton = rootView.findViewById(R.id.basketballShowHidePlayersButton);
        Button resetButton = rootView.findViewById(R.id.basketballResetButton);

        final ArrayList<Button> Team_1_Buttons = new ArrayList<>();
        Team_1_Buttons.add(Team_1.getOnePointThrowsCountButton());
        Team_1_Buttons.add(Team_1.getTwoPointsThrowsCountButton());
        Team_1_Buttons.add(Team_1.getThreePointsThrowsCountButton());
        Team_1_Buttons.add(Team_1.getBlockadesCountButton());
        Team_1_Buttons.add(Team_1.getInterceptionsCountButton());
        Team_1_Buttons.add(Team_1.getFoulsCountButton());
        Team_1_Buttons.add(Team_1.getBallPicksCountButton());

        final ArrayList<Button> Team_2_Buttons = new ArrayList<>();
        Team_2_Buttons.add(Team_2.getOnePointThrowsCountButton());
        Team_2_Buttons.add(Team_2.getTwoPointsThrowsCountButton());
        Team_2_Buttons.add(Team_2.getThreePointsThrowsCountButton());
        Team_2_Buttons.add(Team_2.getBlockadesCountButton());
        Team_2_Buttons.add(Team_2.getInterceptionsCountButton());
        Team_2_Buttons.add(Team_2.getFoulsCountButton());
        Team_2_Buttons.add(Team_2.getBallPicksCountButton());

        //Defining onClickListeners
        View.OnClickListener plusOneOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView countTextView = rootView.findViewById(view.getNextFocusForwardId());
                int count = Integer.parseInt(countTextView.getText().toString());
                count++;
                countTextView.setText("" + count);

                if (view.getId() == R.id.basketballTeam_1_OnePointButton) {
                    TextView basketballTeam_1_ScoreTextView = rootView.findViewById(R.id.basketballTeam_1_Score);
                    int score = Integer.parseInt(basketballTeam_1_ScoreTextView.getText().toString());
                    score++;
                    basketballTeam_1_ScoreTextView.setText("" + score);
                }
                if (view.getId() == R.id.basketballTeam_1_TwoPointsButton) {
                    TextView basketballTeam_1_ScoreTextView = rootView.findViewById(R.id.basketballTeam_1_Score);
                    int score = Integer.parseInt(basketballTeam_1_ScoreTextView.getText().toString());
                    score += 2;
                    basketballTeam_1_ScoreTextView.setText("" + score);
                }
                if (view.getId() == R.id.basketballTeam_1_ThreePointsButton) {
                    TextView basketballTeam_1_ScoreTextView = rootView.findViewById(R.id.basketballTeam_1_Score);
                    int score = Integer.parseInt(basketballTeam_1_ScoreTextView.getText().toString());
                    score += 3;
                    basketballTeam_1_ScoreTextView.setText("" + score);
                }
                if (view.getId() == R.id.basketballTeam_2_OnePointButton) {
                    TextView basketballTeam_2_ScoreTextView = rootView.findViewById(R.id.basketballTeam_2_Score);
                    int score = Integer.parseInt(basketballTeam_2_ScoreTextView.getText().toString());
                    score++;
                    basketballTeam_2_ScoreTextView.setText("" + score);
                }
                if (view.getId() == R.id.basketballTeam_2_TwoPointsButton) {
                    TextView basketballTeam_2_ScoreTextView = rootView.findViewById(R.id.basketballTeam_2_Score);
                    int score = Integer.parseInt(basketballTeam_2_ScoreTextView.getText().toString());
                    score += 2;
                    basketballTeam_2_ScoreTextView.setText("" + score);
                }
                if (view.getId() == R.id.basketballTeam_2_ThreePointsButton) {
                    TextView basketballTeam_2_ScoreTextView = rootView.findViewById(R.id.basketballTeam_2_Score);
                    int score = Integer.parseInt(basketballTeam_2_ScoreTextView.getText().toString());
                    score += 3;
                    basketballTeam_2_ScoreTextView.setText("" + score);
                }

            }
        };

        View.OnClickListener showHideOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout playerLinearLayout = rootView.findViewById(view.getNextFocusForwardId());
                if (playerLinearLayout.getVisibility() == View.GONE) {
                    playerLinearLayout.setVisibility(View.VISIBLE);
                } else {
                    playerLinearLayout.setVisibility(View.GONE);
                }
            }
        };

        View.OnClickListener showHideAllOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (Player player : Team_1.getPlayers()) {
                    if (player.getPlayerButton().getVisibility() == View.GONE) {
                        showHideButton.setText(R.string.hide_players);
                        player.getPlayerButton().setVisibility(View.VISIBLE);
                    } else {
                        showHideButton.setText(R.string.show_players);
                        player.getPlayerButton().setVisibility(View.GONE);
                        rootView.findViewById(player.getPlayerButton().getNextFocusForwardId())
                                .setVisibility(View.GONE);
                    }
                }

                for (Player player : Team_2.getPlayers()) {
                    if (player.getPlayerButton().getVisibility() == View.GONE) {
                        showHideButton.setText(R.string.hide_players);
                        player.getPlayerButton().setVisibility(View.VISIBLE);
                    } else {
                        showHideButton.setText(R.string.show_players);
                        player.getPlayerButton().setVisibility(View.GONE);
                        rootView.findViewById(player.getPlayerButton().getNextFocusForwardId()).setVisibility(View.GONE);
                    }
                }
            }
        };

        View.OnClickListener resetOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (Button teamButton : Team_1_Buttons) {
                    TextView teamTextView = rootView.findViewById(teamButton.getNextFocusForwardId());
                    teamTextView.setText(R.string.zero);
                }

                for (Button teamButton : Team_2_Buttons) {
                    TextView teamTextView = rootView.findViewById(teamButton.getNextFocusForwardId());
                    teamTextView.setText(R.string.zero);
                }

                for (Player player : Team_1.getPlayers()) {
                    TextView playerTextView = rootView.findViewById(player.getPlayerRecord_1_Button().getNextFocusForwardId());
                    playerTextView.setText(R.string.zero);
                    playerTextView = rootView.findViewById(player.getPlayerRecord_2_Button().getNextFocusForwardId());
                    playerTextView.setText(R.string.zero);
                }

                for (Player player : Team_2.getPlayers()) {
                    TextView playerTextView = rootView.findViewById(player.getPlayerRecord_1_Button().getNextFocusForwardId());
                    playerTextView.setText(R.string.zero);
                    playerTextView = rootView.findViewById(player.getPlayerRecord_2_Button().getNextFocusForwardId());
                    playerTextView.setText(R.string.zero);
                }

                TextView scoreTextView = rootView.findViewById(R.id.basketballTeam_1_Score);
                scoreTextView.setText("0");
                scoreTextView = rootView.findViewById(R.id.basketballTeam_2_Score);
                scoreTextView.setText("0");
            }
        };

        // Setting onClickListener for Team_1 team buttons
        for (Button teamButton : Team_1_Buttons) {
            teamButton.setOnClickListener(plusOneOnClickListener);
        }

        // Setting onClickListener for Team_2 buttons
        for (Button teamButton : Team_2_Buttons) {
            teamButton.setOnClickListener(plusOneOnClickListener);
        }

        // Setting onClickListener for Team_1 players records buttons
        for (Player player : Team_1.getPlayers()) {
            player.getPlayerRecord_1_Button().setOnClickListener(plusOneOnClickListener);
        }

        for (Player player : Team_1.getPlayers()) {
            player.getPlayerRecord_2_Button().setOnClickListener(plusOneOnClickListener);
        }

        // Setting onClickListener for Team_2 players records buttons
        for (Player player : Team_2.getPlayers()) {
            player.getPlayerRecord_1_Button().setOnClickListener(plusOneOnClickListener);
        }

        for (Player player : Team_2.getPlayers()) {
            player.getPlayerRecord_2_Button().setOnClickListener(plusOneOnClickListener);
        }

        // Setting onClickListener for player buttons
        for (Player player : Team_1.getPlayers()) {
            player.getPlayerButton().setOnClickListener(showHideOnClickListener);
        }

        for (Player player : Team_2.getPlayers()) {
            player.getPlayerButton().setOnClickListener(showHideOnClickListener);
        }

        // Setting onClickListeners for show/hide button and reset
        showHideButton.setOnClickListener(showHideAllOnClickListener);
        resetButton.setOnClickListener(resetOnClickListener);

        return rootView;
    }
}