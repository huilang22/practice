/*
 * Generated code DO NOT EDIT
 * Generated file: CtcGenreUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcGenreUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcGenreUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcGenreObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcGenreUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcGenreUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGenreObjectData noOpInIn) {
    super(id, context, "CtcGenreUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(noOpIn, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }
/**
 *
 * Sets the  CtcGenre
 * @param noOpInIn CtcGenreObjectData to set
 *
 */
  public void setCtcGenre(CtcGenreObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcGenre passed into the constructor
 * @return Simulated response
 *
 */
  public CtcGenreObjectData getCtcGenre() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcGenreObjectHelper.fromMap(inputMap, "CtcGenre");
  }
}
