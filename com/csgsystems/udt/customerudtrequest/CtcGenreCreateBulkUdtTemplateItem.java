/*
 * Generated code DO NOT EDIT
 * Generated file: CtcGenreCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcGenreCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcGenreCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcGenreObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcGenreCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcGenreCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGenreObjectData CreateInIn) {
    super(id, context, "CtcGenreCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(CreateIn, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }


/**
 *
 * Sets the CtcGenre
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcGenre(CtcGenreObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcGenreObjectHelper.fromMap(inputMap, "CtcGenre");
  }

/**
 *
 * Gets the CtcGenre
 * @return Value of the CtcGenre
 *
 */

  public CtcGenreObjectData getCtcGenre( ) {
    return CreateIn;
  }

}
