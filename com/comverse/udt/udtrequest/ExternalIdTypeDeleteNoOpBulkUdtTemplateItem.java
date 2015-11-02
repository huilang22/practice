/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExternalIdTypeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExternalIdTypeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExternalIdTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   ExternalIdTypeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExternalIdTypeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalIdTypeObjectData noOpInIn) {
    super(id, context, "ExternalIdTypeDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(noOpIn, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }
/**
 *
 * Sets the  ExternalIdType
 * @param noOpInIn ExternalIdTypeObjectData to set
 *
 */
  public void setExternalIdType(ExternalIdTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExternalIdType passed into the constructor
 * @return Simulated response
 *
 */
  public ExternalIdTypeObjectData getExternalIdType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExternalIdTypeObjectHelper.fromMap(inputMap, "ExternalIdType");
  }
}
