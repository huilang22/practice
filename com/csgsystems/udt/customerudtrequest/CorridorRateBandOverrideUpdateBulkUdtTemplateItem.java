/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateBandOverrideUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a CorridorRateBandOverrideUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorRateBandOverrideUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CRBOObjectData CRBOUpdateIn;
/**
 *
 * Constructor to create a  CorridorRateBandOverrideUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorRateBandOverrideUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CRBOObjectData CRBOUpdateInIn) {
    super(id, context, "CorridorRateBandOverrideUpdate");
    CRBOUpdateIn = CRBOUpdateInIn;
  }

  public void translateToMap() {
    if (CRBOUpdateIn != null) {
      CRBOUpdateIn.resetFlags(true, true);
      addInput("CorridorRateBandOverride", CRBOObjectHelper.toMap(CRBOUpdateIn, new HashMap(), "CorridorRateBandOverride").get("CorridorRateBandOverride"));
    }
  }


/**
 *
 * Sets the CorridorRateBandOverride
 * @param CRBOUpdateInIn Value of the CRBOUpdateIn
 *
 */

  public void setCorridorRateBandOverride(CRBOObjectData CRBOUpdateInIn) {
    CRBOUpdateIn = CRBOUpdateInIn;
  }

  public void translateFromMap() {
    CRBOUpdateIn = CRBOObjectHelper.fromMap(inputMap, "CorridorRateBandOverride");
  }

/**
 *
 * Gets the CorridorRateBandOverride
 * @return Value of the CorridorRateBandOverride
 *
 */

  public CRBOObjectData getCorridorRateBandOverride( ) {
    return CRBOUpdateIn;
  }

}
