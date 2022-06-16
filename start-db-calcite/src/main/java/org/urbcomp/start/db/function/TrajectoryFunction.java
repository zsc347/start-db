package org.urbcomp.start.db.function;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.locationtech.jts.geom.Point;
import org.urbcomp.start.db.model.sample.ModelGenerator;
import org.urbcomp.start.db.model.trajectory.Trajectory;

import java.sql.Timestamp;

public class TrajectoryFunction {

    @StartDBFunction("st_traj_asGeoJSON")
    public String st_traj_asGeoJSON(Trajectory trajectory) throws JsonProcessingException {
        return trajectory.toGeoJSON();
    }

    @StartDBFunction("st_traj_fromGeoJSON")
    public Trajectory st_traj_fromGeoJSON(String str) throws JsonProcessingException {
        return Trajectory.fromGeoJSON(str);
    }

    @StartDBFunction("st_traj_oid")
    public String st_traj_oid(Trajectory trajectory) {
        return trajectory.getOid();
    }

    @StartDBFunction("st_traj_tid")
    public String st_traj_tid(Trajectory trajectory) {
        return trajectory.getTid();
    }

    @StartDBFunction("st_traj_startTime")
    public Timestamp st_traj_startTime(Trajectory trajectory) {
        return trajectory.getStartTime();
    }

    @StartDBFunction("st_traj_endTime")
    public Timestamp st_traj_endTime(Trajectory trajectory) {
        return trajectory.getEndTime();
    }

    @StartDBFunction("st_traj_startPoint")
    public Point st_traj_startPoint(Trajectory trajectory) {
        return trajectory.getStartPoint();
    }

    @StartDBFunction("st_traj_endPoint")
    public Point st_traj_endPoint(Trajectory trajectory) {
        return trajectory.getEndPoint();
    }

    @StartDBFunction("st_traj_numOfPoints")
    public int st_traj_numOfPoints(Trajectory trajectory) {
        return trajectory.getGPSPointList().size();
    }

    @StartDBFunction("st_traj_pointN")
    public Point st_traj_pointN(Trajectory trajectory, int n) {
        return trajectory.getGPSPointList().get(n);
    }

    @StartDBFunction("st_traj_timeN")
    public Timestamp st_traj_timeN(Trajectory trajectory, int n) {
        return trajectory.getGPSPointList().get(n).getTime();
    }

    @StartDBFunction("st_traj_lengthInKM")
    public double st_traj_lengthInKM(Trajectory trajectory) {
        return 0.0;
    }

}