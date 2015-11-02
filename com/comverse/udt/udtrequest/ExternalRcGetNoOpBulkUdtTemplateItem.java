/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalRcGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ExternalRcGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExternalRcGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExternalRcObjectData noOpIn;

/**
 *
 * Constructor to create a   ExternalRcGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExternalRcGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalRcObjectData noOpInIn) {
    super(id, context, "ExternalRcGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExternalRc", ExternalRcObjectHelper.toMap(noOpIn, new HashMap(), "ExternalRc").get("ExternalRc"));
    }
  }
/**
 *
 * Sets the  ExternalRc
 * @param noOpInIn ExternalRcObjectData to set
 *
 */
  public void setExternalRc(ExternalRcObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExternalRc passed into the constructor
 * @return Simulated response
 *
 */
  public ExternalRcObjectData getExternalRc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExternalRcObjectHelper.fromMap(inputMap, "ExternalRc");
  }
}
