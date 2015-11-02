
package com.csgsystems.bp.interfaces;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.Remote;

import com.csgsystems.bali.BaliInterface;

import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.constraint.ConstraintException;


import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface MultiLinesAdjInterface extends BaliInterface {

  /**
   * Returns count of MultiLinesAdj object matching the supplied filter values..
   * Convenience method using default BSDMSessionContext.
   * @param MLA_Bill_Count_In Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (MultiLinesAdjObjectFilter MLA_Bill_Count_In) throws BSDMResourceException;
  /**
   * Returns count of MultiLinesAdj object matching the supplied filter values..
   * @param context The session context to use when connecting to the APITS server.
   * @param MLA_Bill_Count_In Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BSDMSessionContext context, MultiLinesAdjObjectFilter MLA_Bill_Count_In) throws BSDMResourceException;


  /**
   * Returns count of MultiLinesAdj object matching the supplied filter values..
   * Convenience method using default BSDMSessionContext.
   * @param MLA_Bill_Count_In Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findCount (MultiLinesAdjObjectFilter MLA_Bill_Count_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns count of MultiLinesAdj object matching the supplied filter values..
   * @param context The session context to use when connecting to the APITS server.
   * @param MLA_Bill_Count_In Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findCount (BSDMSessionContext context, MultiLinesAdjObjectFilter MLA_Bill_Count_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Returns one or more MultiLinesAdj objects matching the supplied filter values..
   * Convenience method using default BSDMSessionContext.
   * @param MLA_Bill_Find_In Input Filter Object.
   * @return MultiLinesAdjObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public MultiLinesAdjObjectDataList find (MultiLinesAdjObjectFilter MLA_Bill_Find_In) throws BSDMResourceException;
  /**
   * Returns one or more MultiLinesAdj objects matching the supplied filter values..
   * @param context The session context to use when connecting to the APITS server.
   * @param MLA_Bill_Find_In Input Filter Object.
   * @return MultiLinesAdjObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public MultiLinesAdjObjectDataList find (BSDMSessionContext context, MultiLinesAdjObjectFilter MLA_Bill_Find_In) throws BSDMResourceException;


  /**
   * Returns one or more MultiLinesAdj objects matching the supplied filter values..
   * Convenience method using default BSDMSessionContext.
   * @param MLA_Bill_Find_In Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return MultiLinesAdjObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public MultiLinesAdjObjectDataList find (MultiLinesAdjObjectFilter MLA_Bill_Find_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns one or more MultiLinesAdj objects matching the supplied filter values..
   * @param context The session context to use when connecting to the APITS server.
   * @param MLA_Bill_Find_In Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return MultiLinesAdjObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public MultiLinesAdjObjectDataList find (BSDMSessionContext context, MultiLinesAdjObjectFilter MLA_Bill_Find_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete one or more MultiLinesAdj objects matching the supplied filter values..
   * Convenience method using default BSDMSessionContext.
   * @param MLA_Delete_In Input Filter Object.
   * @return MultiLinesAdjObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public MultiLinesAdjObjectDataList delete (MultiLinesAdjKeyObjectFilter MLA_Delete_In) throws BSDMResourceException;
  /**
   * Delete one or more MultiLinesAdj objects matching the supplied filter values..
   * @param context The session context to use when connecting to the APITS server.
   * @param MLA_Delete_In Input Filter Object.
   * @return MultiLinesAdjObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public MultiLinesAdjObjectDataList delete (BSDMSessionContext context, MultiLinesAdjKeyObjectFilter MLA_Delete_In) throws BSDMResourceException;


  /**
   * Delete one or more MultiLinesAdj objects matching the supplied filter values..
   * Convenience method using default BSDMSessionContext.
   * @param MLA_Delete_In Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return MultiLinesAdjObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public MultiLinesAdjObjectDataList delete (MultiLinesAdjKeyObjectFilter MLA_Delete_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete one or more MultiLinesAdj objects matching the supplied filter values..
   * @param context The session context to use when connecting to the APITS server.
   * @param MLA_Delete_In Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return MultiLinesAdjObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public MultiLinesAdjObjectDataList delete (BSDMSessionContext context, MultiLinesAdjKeyObjectFilter MLA_Delete_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
