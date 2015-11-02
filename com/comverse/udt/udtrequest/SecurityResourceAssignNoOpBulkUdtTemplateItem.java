/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceAssignNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SecurityResourceAssignNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SecurityResourceAssignNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SecurityResourceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SecurityResourceAssignNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SecurityResourceAssignNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityResourceObjectDataList noOpInIn) {
    super(id, context, "SecurityResourceAssign");
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
        mapArray[i] = SecurityResourceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SecurityResource", noOpIn);
      }
      addInput("SecurityResource", mapList);
    }
  }
/**
 *
 * Sets the  SecurityResource
 * @param noOpInIn SecurityResourceObjectDataList to set
 *
 */
  public void setSecurityResource(SecurityResourceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SecurityResource passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityResourceObjectDataList getSecurityResource() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SecurityResourceObjectHelper.fromMapList(inputMap, "SecurityResourceList");
  }
}
