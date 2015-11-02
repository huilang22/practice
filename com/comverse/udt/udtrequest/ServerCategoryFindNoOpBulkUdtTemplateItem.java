/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerCategoryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServerCategoryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServerCategoryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SCObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServerCategoryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServerCategoryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SCObjectDataList noOpInIn) {
    super(id, context, "ServerCategoryFind");
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
        mapArray[i] = SCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServerCategory", noOpIn);
      }
      addInput("ServerCategory", mapList);
    }
  }
/**
 *
 * Sets the  ServerCategory
 * @param noOpInIn SCObjectDataList to set
 *
 */
  public void setServerCategory(SCObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServerCategory passed into the constructor
 * @return Simulated response
 *
 */
  public SCObjectDataList getServerCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SCObjectHelper.fromMapList(inputMap, "ServerCategoryList");
  }
}
