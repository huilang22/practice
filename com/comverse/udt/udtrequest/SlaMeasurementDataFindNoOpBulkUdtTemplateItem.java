/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementDataFindNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a SlaMeasurementDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SlaMeasurementDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SlaMeasurementDataObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SlaMeasurementDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SlaMeasurementDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SlaMeasurementDataObjectDataList noOpInIn) {
    super(id, context, "SlaMeasurementDataFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = SlaMeasurementDataObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SlaMeasurementData", noOpIn);
      }
      addInput("SlaMeasurementData", mapList);
    }
  }
/**
 *
 * Sets the  SlaMeasurementData
 * @param noOpInIn SlaMeasurementDataObjectDataList to set
 *
 */
  public void setSlaMeasurementData(SlaMeasurementDataObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SlaMeasurementData passed into the constructor
 * @return Simulated response
 *
 */
  public SlaMeasurementDataObjectDataList getSlaMeasurementData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SlaMeasurementDataObjectHelper.fromMapList(inputMap, "SlaMeasurementDataList");
  }
}
