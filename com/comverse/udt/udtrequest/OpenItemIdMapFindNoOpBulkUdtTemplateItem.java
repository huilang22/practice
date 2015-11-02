/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OpenItemIdMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OpenItemIdMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OpenItemIdMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   OpenItemIdMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OpenItemIdMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemIdMapObjectDataList noOpInIn) {
    super(id, context, "OpenItemIdMapFind");
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
        mapArray[i] = OpenItemIdMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OpenItemIdMap", noOpIn);
      }
      addInput("OpenItemIdMap", mapList);
    }
  }
/**
 *
 * Sets the  OpenItemIdMap
 * @param noOpInIn OpenItemIdMapObjectDataList to set
 *
 */
  public void setOpenItemIdMap(OpenItemIdMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OpenItemIdMap passed into the constructor
 * @return Simulated response
 *
 */
  public OpenItemIdMapObjectDataList getOpenItemIdMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OpenItemIdMapObjectHelper.fromMapList(inputMap, "OpenItemIdMapList");
  }
}
