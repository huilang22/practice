/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateBandOverrideGetBulkUdtTemplateItem.java
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
 * Class used to create a CorridorRateBandOverrideGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorRateBandOverrideGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CRBOObjectKeyData CRBOGetIn;
/**
 *
 * Constructor to create a  CorridorRateBandOverrideGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorRateBandOverrideGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CRBOObjectKeyData CRBOGetInIn) {
    super(id, context, "CorridorRateBandOverrideGet");
    CRBOGetIn = CRBOGetInIn;
  }

  public void translateToMap() {
    if (CRBOGetIn != null) {
      CRBOGetIn.resetFlags(true, true);
      addInput("CorridorRateBandOverride", CRBOObjectKeyHelper.toMap(CRBOGetIn, new HashMap(), "CRBOObjectKeyData").get("CRBOObjectKeyData"));
    }
  }


/**
 *
 * Sets the CorridorRateBandOverride
 * @param CRBOGetInIn Value of the CRBOGetIn
 *
 */

  public void setCorridorRateBandOverride(CRBOObjectKeyData CRBOGetInIn) {
    CRBOGetIn = CRBOGetInIn;
  }

  public void translateFromMap() {
    CRBOGetIn = CRBOObjectKeyHelper.fromMap(inputMap, "CorridorRateBandOverride");
  }

/**
 *
 * Gets the CorridorRateBandOverride
 * @return Value of the CorridorRateBandOverride
 *
 */

  public CRBOObjectKeyData getCorridorRateBandOverride( ) {
    return CRBOGetIn;
  }

}
