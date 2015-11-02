/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionGetBulkUdtTemplateItem.java
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
 * Class used to create a ExclusionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ExclusionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExclusionObjectKeyData excGetIn;
/**
 *
 * Constructor to create a  ExclusionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExclusionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ExclusionObjectKeyData excGetInIn) {
    super(id, context, "ExclusionGet");
    excGetIn = excGetInIn;
  }

  public void translateToMap() {
    if (excGetIn != null) {
      excGetIn.resetFlags(true, true);
      addInput("Exclusion", ExclusionObjectKeyHelper.toMap(excGetIn, new HashMap(), "ExclusionObjectKeyData").get("ExclusionObjectKeyData"));
    }
  }


/**
 *
 * Sets the Exclusion
 * @param excGetInIn Value of the excGetIn
 *
 */

  public void setExclusion(ExclusionObjectKeyData excGetInIn) {
    excGetIn = excGetInIn;
  }

  public void translateFromMap() {
    excGetIn = ExclusionObjectKeyHelper.fromMap(inputMap, "Exclusion");
  }

/**
 *
 * Gets the Exclusion
 * @return Value of the Exclusion
 *
 */

  public ExclusionObjectKeyData getExclusion( ) {
    return excGetIn;
  }

}
