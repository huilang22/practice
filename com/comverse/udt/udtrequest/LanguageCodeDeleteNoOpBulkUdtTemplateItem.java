/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LanguageCodeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LanguageCodeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LCObjectData noOpIn;

/**
 *
 * Constructor to create a   LanguageCodeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LanguageCodeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LCObjectData noOpInIn) {
    super(id, context, "LanguageCodeDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("LanguageCode", LCObjectHelper.toMap(noOpIn, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }
/**
 *
 * Sets the  LanguageCode
 * @param noOpInIn LCObjectData to set
 *
 */
  public void setLanguageCode(LCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LanguageCode passed into the constructor
 * @return Simulated response
 *
 */
  public LCObjectData getLanguageCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LCObjectHelper.fromMap(inputMap, "LanguageCode");
  }
}
