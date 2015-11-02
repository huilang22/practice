/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OpenItemFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OpenItemFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OpenItemObjectDataList noOpIn;

/**
 *
 * Constructor to create a   OpenItemFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OpenItemFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemObjectDataList noOpInIn) {
    super(id, context, "OpenItemFind");
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
        mapArray[i] = OpenItemObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OpenItem", noOpIn);
      }
      addInput("OpenItem", mapList);
    }
  }
/**
 *
 * Sets the  OpenItem
 * @param noOpInIn OpenItemObjectDataList to set
 *
 */
  public void setOpenItem(OpenItemObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OpenItem passed into the constructor
 * @return Simulated response
 *
 */
  public OpenItemObjectDataList getOpenItem() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OpenItemObjectHelper.fromMapList(inputMap, "OpenItemList");
  }
}
