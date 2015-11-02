/*
 * Generated code DO NOT EDIT
 * Generated file: CtcGenreGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcGenreGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcGenreGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcGenreObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcGenreGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcGenreGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGenreObjectKeyData GetInIn) {
    super(id, context, "CtcGenreGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcGenre", CtcGenreObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcGenreObjectKeyData").get("CtcGenreObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcGenre
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcGenre(CtcGenreObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcGenreObjectKeyHelper.fromMap(inputMap, "CtcGenre");
  }

/**
 *
 * Gets the CtcGenre
 * @return Value of the CtcGenre
 *
 */

  public CtcGenreObjectKeyData getCtcGenre( ) {
    return GetIn;
  }

}
