/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorDeleteListNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorDeleteListNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorDeleteListNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CorridorObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CorridorDeleteListNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorDeleteListNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CorridorObjectDataList noOpInIn) {
    super(id, context, "CorridorDeleteList");
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
        mapArray[i] = CorridorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Corridor", noOpIn);
      }
      addInput("Corridor", mapList);
    }
  }
/**
 *
 * Sets the  Corridor
 * @param noOpInIn CorridorObjectDataList to set
 *
 */
  public void setCorridor(CorridorObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Corridor passed into the constructor
 * @return Simulated response
 *
 */
  public CorridorObjectDataList getCorridor() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CorridorObjectHelper.fromMapList(inputMap, "CorridorList");
  }
}
