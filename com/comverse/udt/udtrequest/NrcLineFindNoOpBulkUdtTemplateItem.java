/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a NrcLineFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcLineFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcLineObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NrcLineFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcLineFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcLineObjectDataList noOpInIn) {
    super(id, context, "NrcLineFind");
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
        mapArray[i] = NrcLineObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NrcLine", noOpIn);
      }
      addInput("NrcLine", mapList);
    }
  }
/**
 *
 * Sets the  NrcLine
 * @param noOpInIn NrcLineObjectDataList to set
 *
 */
  public void setNrcLine(NrcLineObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcLine passed into the constructor
 * @return Simulated response
 *
 */
  public NrcLineObjectDataList getNrcLine() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcLineObjectHelper.fromMapList(inputMap, "NrcLineList");
  }
}
