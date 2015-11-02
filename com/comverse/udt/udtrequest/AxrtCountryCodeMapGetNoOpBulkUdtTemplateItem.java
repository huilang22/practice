/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtCountryCodeMapGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AxrtCountryCodeMapGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AxrtCountryCodeMapGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AxrtCountryCodeMapObjectData noOpIn;

/**
 *
 * Constructor to create a   AxrtCountryCodeMapGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AxrtCountryCodeMapGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtCountryCodeMapObjectData noOpInIn) {
    super(id, context, "AxrtCountryCodeMapGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AxrtCountryCodeMap", AxrtCountryCodeMapObjectHelper.toMap(noOpIn, new HashMap(), "AxrtCountryCodeMap").get("AxrtCountryCodeMap"));
    }
  }
/**
 *
 * Sets the  AxrtCountryCodeMap
 * @param noOpInIn AxrtCountryCodeMapObjectData to set
 *
 */
  public void setAxrtCountryCodeMap(AxrtCountryCodeMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AxrtCountryCodeMap passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtCountryCodeMapObjectData getAxrtCountryCodeMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AxrtCountryCodeMapObjectHelper.fromMap(inputMap, "AxrtCountryCodeMap");
  }
}
