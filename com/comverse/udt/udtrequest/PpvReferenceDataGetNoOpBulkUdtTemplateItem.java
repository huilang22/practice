/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvReferenceDataGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * NoOp class used to simulate a PpvReferenceDataGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PpvReferenceDataGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PpvReferenceDataGetOutputData noOpIn;

/**
 *
 * Constructor to create a   PpvReferenceDataGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PpvReferenceDataGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PpvReferenceDataGetOutputData noOpInIn) {
    super(id, context, "PpvReferenceDataGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PpvReferenceDataGetOutputData", PpvReferenceDataGetOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  PpvReferenceDataGetOutputData
 * @param noOpInIn PpvReferenceDataGetOutputData to set
 *
 */
  public void setPpvReferenceDataGetOutputData(PpvReferenceDataGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PpvReferenceDataGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public PpvReferenceDataGetOutputData getPpvReferenceDataGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PpvReferenceDataGetOutputHelper.fromMap(inputMap);
  }
}
